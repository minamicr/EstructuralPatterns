package br.com.cod3r.flyweight.musicPlayer.service;

import br.com.cod3r.flyweight.musicPlayer.musicFlyweight.FlyweightFactory;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import br.com.cod3r.flyweight.musicPlayer.model.Music;

public class MusicService {
	private Map<String, Map<String, Music>> memory;
	FlyweightFactory musicFactory = FlyweightFactory.getInstance();

	public MusicService() {
		memory = new HashMap<String, Map<String, Music>>();
	}
	
	public void listenMusic(String user, String desc) {
		Map<String, Music> userPlayList = getPlayList(user);
		
		Music song = getMusic(userPlayList, desc);

		System.out.println(String.format("%s is listenning '%s'",
				user, song.getMusicFlyweight().getName()));

		song.listenning();
	}
	
  private Map<String, Music> getPlayList(String user){
		Map<String, Music> userPlayList = memory.get(user);

		if(userPlayList == null) {
			userPlayList = new HashMap<>();
			memory.put(user, userPlayList);
		}
		return userPlayList;
	}

	private Music getMusic(Map<String, Music> userPlayList, String desc) {
		Music music = userPlayList.get(desc);

		if(music == null) {
			music = new Music(musicFactory.getMusic(desc));
			userPlayList.put(desc, music);
		}

		return music;
	}

	public void report() {
		int musicInMemory = 0;
		Set<String> users = memory.keySet();
		for(String user: users) {
			int timeCounter = 0;
			System.out.println("---------");
			System.out.println(user + " has listen...");
			Collection<Music> musics = memory.get(user).values();
			for(Music music: musics) {
				System.out.println(String.format("%s/%s %d times", 
						music.getMusicFlyweight().getArtist(),
						music.getMusicFlyweight().getName(),
						music.getPlayerQty()));
				timeCounter += (music.getPlayerQty() * music.getMusicFlyweight().getDurationInSeconds());
				musicInMemory++;
			}
			System.out.println(String.format("%s has listen music for %d seconds", user, timeCounter));
		}
		System.out.println("Total of musics in memory: " + musicInMemory);
		System.out.println("Total of musics in repository: " + musicFactory.countMusicRepository());
	}
}

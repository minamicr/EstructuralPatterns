package br.com.cod3r.flyweight.musicPlayer.musicFlyweight;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
  private static FlyweightFactory instance = new FlyweightFactory();
  private Map<String, MusicFlyweight> musicFlyweightRepository;

  private FlyweightFactory() {
    musicFlyweightRepository = new HashMap<String, MusicFlyweight>();
  }

  public static FlyweightFactory getInstance(){
    return instance;
  }

  public MusicFlyweight getMusic(String desc) {
    MusicFlyweight music = musicFlyweightRepository.get(desc);
    if (music == null) {
      music = getMusicByString(desc);
      musicFlyweightRepository.put(desc, music);
    }
    return music;
  }

  public MusicFlyweight getMusicByString(String desc){
    String[] data = desc.split(";");
    return new MusicFlyweight(data[0], data[1], Integer.parseInt(data[2]));

  }

  public Integer countMusicRepository() {
    return musicFlyweightRepository.size();
  }
}

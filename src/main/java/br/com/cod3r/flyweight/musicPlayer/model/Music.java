package br.com.cod3r.flyweight.musicPlayer.model;

import br.com.cod3r.flyweight.musicPlayer.musicFlyweight.MusicFlyweight;

public class Music {
	private MusicFlyweight musicFlyweight;
	private Integer playerQty;

	
	public Music(MusicFlyweight musicFlyweight) {
		this.musicFlyweight = musicFlyweight;
		this.playerQty = 0;
	}
	
	public void listenning() {
		playerQty++;
	}

	public Integer getPlayerQty() {
		return playerQty;
	}

	public void setPlayerQty(Integer playerQty) {
		this.playerQty = playerQty;
	}

	public MusicFlyweight getMusicFlyweight(){
		return this.musicFlyweight;
	}


	@Override
	public String toString() {
		return "Music{" +
				"musicFlyweight=" + musicFlyweight +
				", playerQty=" + playerQty +
				'}';
	}
}

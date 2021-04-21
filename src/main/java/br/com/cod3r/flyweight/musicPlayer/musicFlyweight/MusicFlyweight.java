package br.com.cod3r.flyweight.musicPlayer.musicFlyweight;

public class MusicFlyweight {
  private String name;
  private String artist;
  private Integer durationInSeconds;

  public MusicFlyweight(String name, String artist, Integer duration) {
    this.name = name;
    this.artist = artist;
    this.durationInSeconds = duration;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getArtist() {
    return artist;
  }

  public void setArtist(String artist) {
    this.artist = artist;
  }

  public Integer getDurationInSeconds() {
    return durationInSeconds;
  }
}

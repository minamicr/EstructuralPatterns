package br.com.cod3r.adapter.tvPort.adapters;

import br.com.cod3r.adapter.tvPort.devices.OldMonitor;
import br.com.cod3r.adapter.tvPort.intefaces.HDMI;
import br.com.cod3r.adapter.tvPort.intefaces.VGA;

public class HDMIToOldMonitorAdapter extends OldMonitor implements HDMI {

  @Override
  public void setImage(String image){
    super.setImage(image);
    System.out.println("override set image");
  }

  @Override
  public void setSound(String sound) {
    System.out.println("Old monitor has no sound");
  }
}

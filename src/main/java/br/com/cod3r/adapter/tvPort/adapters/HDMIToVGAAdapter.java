package br.com.cod3r.adapter.tvPort.adapters;

import br.com.cod3r.adapter.tvPort.intefaces.HDMI;
import br.com.cod3r.adapter.tvPort.intefaces.VGA;

public class HDMIToVGAAdapter implements HDMI {
  VGA oldMonitor;

  public HDMIToVGAAdapter(VGA oldMonitor){
    this.oldMonitor = oldMonitor;
  }

  @Override
  public void setImage(String image) {
    oldMonitor.setImage(image);
  }

  @Override
  public void setSound(String sound) {
    System.out.println(">>> Monitor sound doesn´t work !");
  }
}

package br.com.cod3r.adapter.tvPort;

import br.com.cod3r.adapter.tvPort.adapters.HDMIToOldMonitorAdapter;
import br.com.cod3r.adapter.tvPort.adapters.HDMIToVGAAdapter;
import br.com.cod3r.adapter.tvPort.devices.Computer;
import br.com.cod3r.adapter.tvPort.devices.OldMonitor;
import br.com.cod3r.adapter.tvPort.devices.TV;
import javax.management.monitor.Monitor;

public class Client {

	public static void main(String[] args) {
		Computer pc = new Computer();
		TV tv = new TV();
		pc.connectPort(tv);
		pc.sendImageAndSound("Cat and rainbow", "Nyan cat song");
		
		System.out.println("------ Monitor ----------");
		OldMonitor monitor = new OldMonitor();
		pc.connectPort(new HDMIToVGAAdapter(monitor));
		pc.sendImageAndSound("image image", "123 testando");

		System.out.println("------ Monitor Class Adapter ----------");
		pc.connectPort(new HDMIToOldMonitorAdapter());
		pc.sendImageAndSound("monitor with class", "no sound");
	}
}

package structural.bridge;


public class AdvanceRemote extends BasicRemote {

	public AdvanceRemote(Device device) {
		
		super(device);
		
	}
	
	public void mute() {
		device.setVolume(0);
	}
	
	public void blast() {
		device.setVolume(100);
	}
	
}

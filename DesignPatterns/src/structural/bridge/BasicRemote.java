package structural.bridge;


public class BasicRemote implements Remote {
	
	protected Device device;

	public BasicRemote(Device device) {
		
		super();
		this.device = device;
		
	}

	@Override
	public void power() {
		
		if(device.isEnabled()) 
			device.disable();
		else
			device.enable();
		
	}

	@Override
	public void volumeDown() {
		
		device.decreaseVolume();
		
	}

	@Override
	public void volumeUp() {
		
		device.increaseVolume();
		
	}

	@Override
	public void channelDown() {
		
		device.previousChannel();
		
	}

	@Override
	public void channelUp() {
		
		device.nextChannel();
		
	}
	
	
}

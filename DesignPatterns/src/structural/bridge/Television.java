package structural.bridge;

public class Television implements Device {
	
	boolean on = false;
	int volume = 50;
	int channel = 0;
	
	@Override
	public boolean isEnabled() {
		
		return on;
		
	}
	
	@Override
	public void enable() {
		
		on = true;
		
	}
	
	@Override
	public void disable() {
		
		on = false;
		
	}
	
	@Override
	public void increaseVolume() {
		
		if (volume != 100)
			volume++;
		
	}
	
	@Override
	public void decreaseVolume() {
		
		if (volume != 0)
			volume--;
		
	}
	
	@Override
	public void nextChannel() {
		
		if (channel != 400)
			channel++;
		
	}
	
	@Override
	public void previousChannel() {
		
		if (channel == 0)
			channel = 400;
		else
			--channel;
		
	}
	
	@Override
	public void printStatus() {
		
		System.out.println("TV Enabled: " + on + " Volume: " + volume + " Channel: " + channel);
		
	}
	
	@Override
	public void setVolume(int level) {
		
		this.volume = level;
		
	}
	
}

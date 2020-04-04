package structural.bridge;


public class Test {
	
	public static void main(String[] args) {
		
		Device radio = new Radio();
		Remote remote = new BasicRemote(radio);
		radio.printStatus();
		remote.power();
		remote.channelDown();
		remote.channelDown();
		remote.volumeUp();
		remote.volumeUp();
		radio.printStatus();
		
		Device tv = new Television();
		AdvanceRemote advRemote = new AdvanceRemote(tv);
		tv.printStatus();
		advRemote.power();
		advRemote.channelUp();
		advRemote.channelUp();
		advRemote.mute();
		tv.printStatus();
		
	}
}

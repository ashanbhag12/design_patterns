package structural.bridge;


public interface Device {
	
	boolean isEnabled();

    void enable();

    void disable();

    void increaseVolume();

    void decreaseVolume();

    void nextChannel();

    void previousChannel();

    void printStatus();
    
    void setVolume(int level);
}

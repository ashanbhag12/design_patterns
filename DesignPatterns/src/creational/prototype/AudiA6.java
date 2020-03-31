package creational.prototype;

public class AudiA6 extends Car{
	private String infotainmentSystem;

	public String getInfotainmentSystem() {
		return infotainmentSystem;
	}

	public void setInfotainmentSystem(String infotainmentSystem) {
		this.infotainmentSystem = infotainmentSystem;
	}

	@Override
	public String toString() {
		return "AudiA6 [infotainmentSystem=" + infotainmentSystem + ", getColor()=" + getColor() + ", getWheelsMake()="
				+ getWheelsMake() + ", getOilMake()=" + getOilMake() + ", getPrice()=" + getPrice() + "]";
	}
	
	
}

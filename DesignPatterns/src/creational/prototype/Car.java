package creational.prototype;

public abstract class Car implements Cloneable {

	private String color;
	private String wheelsMake;
	private String oilMake;
	private String price;
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getWheelsMake() {
		return wheelsMake;
	}
	public void setWheelsMake(String wheelsMake) {
		this.wheelsMake = wheelsMake;
	}
	public String getOilMake() {
		return oilMake;
	}
	public void setOilMake(String oilMake) {
		this.oilMake = oilMake;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	
	
}

package structural.flyweight;

//Immutable class
public class Car {
	
	private String model;
	private long price;
	
	public Car(String model, long price) {
		
		super();
		this.model = model;
		this.price = price;
		
	}

	public String getModel() {
		
		return model;
		
	}
	
	public long getPrice() {
		
		return price;
		
	}
	
	
}

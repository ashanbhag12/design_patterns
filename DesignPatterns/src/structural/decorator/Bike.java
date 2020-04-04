package structural.decorator;


public class Bike implements Vehicle {

	@Override
	public void addEngine() {
		
		System.out.println("TSI engine added");
		
	}

	@Override
	public void printAccessories() {
		
		System.out.print("Basic bike with ");
		
	}
	
}

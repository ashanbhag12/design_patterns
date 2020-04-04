package structural.decorator;


public class Car implements Vehicle{

	@Override
	public void addEngine() {
		
		System.out.println("TDI engine added");
		
	}

	@Override
	public void printAccessories() {
		
		System.out.print("Car ");
		
	}
	
	
}

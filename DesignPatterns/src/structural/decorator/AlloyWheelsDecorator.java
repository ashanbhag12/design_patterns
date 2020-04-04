package structural.decorator;


public class AlloyWheelsDecorator extends VehicleDecorator {

	public AlloyWheelsDecorator(Vehicle vehicle) {
		
		super(vehicle);
		
	}

	@Override
	public void addEngine() {
		
		vehicle.addEngine();
		
	}

	@Override
	public void printAccessories() {
		
		vehicle.printAccessories();
		System.out.print(" and filled with alloy wheels.");
		
	}
	
}

package structural.decorator;


public abstract class VehicleDecorator implements Vehicle {
	
	protected Vehicle vehicle;
	
	public VehicleDecorator(Vehicle vehicle) {
		
		this.vehicle = vehicle;
		
	}

}

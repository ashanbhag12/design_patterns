package structural.decorator;


public class ACDecorator extends VehicleDecorator {
	
	private String acType;

	public ACDecorator(Vehicle vehicle, String acType) {
		
		super(vehicle);
		this.acType = acType;
		
	}

	@Override
	public void addEngine() {
		
		vehicle.addEngine();
		
	}

	@Override
	public void printAccessories() {
		
		vehicle.printAccessories();
		System.out.print("having AC of type: " + acType + " ,");
		
	}
	
}

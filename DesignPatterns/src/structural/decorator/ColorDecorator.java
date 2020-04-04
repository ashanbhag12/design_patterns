package structural.decorator;


public class ColorDecorator extends VehicleDecorator {

	private Color color;
	public ColorDecorator(Vehicle vehicle, Color color) {
		
		super(vehicle);
		this.color = color;
		
	}

	@Override
	public void addEngine() {
		
		vehicle.addEngine();
		
	}

	@Override
	public void printAccessories() {
		
		vehicle.printAccessories();
		System.out.print("Painted with " + color.toString() + " color, ");
		
	}
	
}

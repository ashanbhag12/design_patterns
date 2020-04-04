package structural.decorator;


public class Test {
	
	public static void main(String[] args) {
		
		Vehicle car = new Car();
		VehicleDecorator decoratedCar = new AlloyWheelsDecorator(new ACDecorator(new ColorDecorator(car, Color.BLUE), "Auto climate control"));
		decoratedCar.printAccessories();
		
		System.out.println();
		
		Vehicle bike = new Bike();
		VehicleDecorator bikeDecorator = new AlloyWheelsDecorator(new ColorDecorator(bike, Color.RED));
		bikeDecorator.printAccessories();
	}
}

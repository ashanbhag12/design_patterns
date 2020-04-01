package creational.abstractfactory;

public class Test {

	public static void main(String[] args) {
		
		CarAbstractFactory factory = CarAbstractFactory.getCarFactory(1500000);
		Car car = factory.getCar(CarType.SEDAN);
		System.out.println(car.getInfo());
		
		CarAbstractFactory factory1 = CarAbstractFactory.getCarFactory(3500000);
		Car car1 = factory1.getCar(CarType.SUV);
		System.out.println(car1.getInfo());
	}
}

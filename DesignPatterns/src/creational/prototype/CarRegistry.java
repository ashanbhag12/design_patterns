package creational.prototype;

import java.util.EnumMap;
import java.util.Map;

public class CarRegistry {

	private Map<CarType, Car> cars = new EnumMap<CarType, Car>(CarType.class);
	
	public CarRegistry() {
		loadItems();
	}
	
	private void loadItems() {
		AudiA6 audi = new AudiA6();
		audi.setColor("White");
		audi.setOilMake("Shell");
		audi.setPrice("45L");
		audi.setWheelsMake("MRF");
		audi.setInfotainmentSystem("JBL");
		cars.put(CarType.AUDI_A6, audi);
		
		
	}
	
	public Car createCar(CarType carType) {

		Car car = null;
		
		try {
			car = (Car) cars.get(carType).clone();
			
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		return car;
	}
}

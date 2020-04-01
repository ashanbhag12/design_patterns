package creational.abstractfactory;

public class AudiFactory extends CarAbstractFactory {

	public Car getCar(CarType carType) {
		
		switch(carType) {
		
			case SEDAN: return new AudiA6();
			
			case SUV: return new AudiQ5();
			
			default: return null;
		
		}
	}
}

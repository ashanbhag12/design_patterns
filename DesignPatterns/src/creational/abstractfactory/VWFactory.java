package creational.abstractfactory;

public class VWFactory extends CarAbstractFactory {
	
	public Car getCar(CarType carType) {
		
		switch(carType) {
		
			case SEDAN: return new Jetta();
			
			case SUV: return new Tiguan();
			
			default: return null;
		
		}
	}
}

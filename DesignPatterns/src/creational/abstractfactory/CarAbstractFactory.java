package creational.abstractfactory;

public abstract class CarAbstractFactory {

	public static CarAbstractFactory getCarFactory(long budget) {
		
		if(budget > 2500000)
			return new AudiFactory();
		else
			return new VWFactory();
		
	}
	
	public abstract Car getCar(CarType carType);
}

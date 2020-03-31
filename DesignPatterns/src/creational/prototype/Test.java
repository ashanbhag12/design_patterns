package creational.prototype;

public class Test {
	
	public static void main(String[] args) {
		CarRegistry registry = new CarRegistry();
		
		AudiA6 audi = (AudiA6)registry.createCar(CarType.AUDI_A6);
		audi.setColor("RED");
		System.out.println(audi);
		System.out.println(audi.hashCode());
		
		AudiA6 audi2 = (AudiA6)registry.createCar(CarType.AUDI_A6);
		audi2.setWheelsMake("Apollo");
		System.out.println(audi2);
		System.out.println(audi2.hashCode());
	}
}

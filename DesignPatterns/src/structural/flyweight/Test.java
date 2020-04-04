package structural.flyweight;


public class Test {
	
	public static void main(String[] args) {
		
		CarCache cache = new CarCache();
		
		Order order1 = new Order();
		order1.addCar(cache.getCar("Audi A4"));
		order1.addCar(cache.getCar("VW Passat"));
		order1.addCar(cache.getCar("Audi Q3"));
		System.out.println("Total Amount: " + order1.getSubtotal());
		
		Order order2 = new Order();
		order2.addCar(cache.getCar("Audi A4"));
		order2.addCar(cache.getCar("Audi Q3"));
		System.out.println("Total Amount: " + order2.getSubtotal());
		
		Order order3 = new Order();
		order3.addCar(cache.getCar("Audi A4"));
		order3.addCar(cache.getCar("VW Passat"));
		System.out.println("Total Amount: " + order3.getSubtotal());
		
		Order order4 = new Order();
		order4.addCar(cache.getCar("Audi Q3"));
		System.out.println("Total Amount: " + order4.getSubtotal());
		
		System.out.println("Total cars created: " + CarCache.getCarsCreatedCount());
		
	}
}

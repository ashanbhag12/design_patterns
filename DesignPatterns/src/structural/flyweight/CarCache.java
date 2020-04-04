package structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class CarCache {
	
	private Map<String, Car> cache = new HashMap<>();
	
	public Car getCar(String model) {
		
		if(!cache.containsKey(model))
			cache.put(model, getCarDetails(model));
		
		return cache.get(model);
	}

	private Car getCarDetails(String model) {
		
		carsCreatedCount++;
		
		// Ideally get from DataStore
		switch(model) {
			case "Audi A4": return new Car("Audi A4", 4500000);
			case "VW Passat": return new Car("VW Passat", 3500000);
			case "Audi Q3": return new Car("Audi Q3", 4000000);
		}
		
		return null;
		
	}
	
	private static int carsCreatedCount = 0;

	
	public static int getCarsCreatedCount() {
		
		return carsCreatedCount;
		
	}

}

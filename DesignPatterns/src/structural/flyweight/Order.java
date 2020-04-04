package structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class Order {
	
	private List<Car> cars = new ArrayList<>();
	private long orderId;
	
	public List<Car> getCars() {
		
		return cars;
		
	}
	
	public void setCars(List<Car> cars) {
		
		this.cars = cars;
		
	}
	
	public void addCar(Car car) {
		
		this.cars.add(car);
		
	}
	
	public long getSubtotal() {
		
		int sum = 0;
		for(Car car : cars)
			sum += car.getPrice();
		
		return sum;
		
	}
	
	public long getOrderId() {
		
		return orderId;
		
	}
	
	public void setOrderId(long orderId) {
		
		this.orderId = orderId;
		
	}
	
	
}

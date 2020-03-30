package creational.singleton;

public class SingletonTest {
	
	public static void main(String[] args) {
		
		Singleton object = Singleton.getInstance();
		System.out.println(object);
		
		Singleton anotherObject = Singleton.getInstance();
		System.out.println(anotherObject);
	}
}	

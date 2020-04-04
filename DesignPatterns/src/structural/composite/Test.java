package structural.composite;


public class Test {
	
	public static void main(String[] args) {
		
		Manager director = new Manager("A", "Director");
		
		Manager manager1 = new Manager("B", "Manages Dev");
		Manager manager2 = new Manager("C", "Manages QA");
		
		director.add(manager1);
		director.add(manager2);
		
		Employee emp1 = new Employee("D", "Java Developer");
		Employee emp2 = new Employee("E", "UI Developer");
		manager1.add(emp1);
		manager1.add(emp2);
		
		Employee emp3 = new Employee("F", "QA");
		manager2.add(emp3);
		
		System.out.println(emp1.display());
		System.out.println(emp2.display());
		System.out.println(emp3.display());
		System.out.println(manager1.display());
		System.out.println(manager2.display());
		System.out.println(director.display());
	}
}

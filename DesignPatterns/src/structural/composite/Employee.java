package structural.composite;


public class Employee extends EmployeeComponent {
	
public Employee(String name, String function){
		
		this.name = name;
		this.function = function;
	}

	@Override
	public String display() {
		
		return print();
		
	}
	
}

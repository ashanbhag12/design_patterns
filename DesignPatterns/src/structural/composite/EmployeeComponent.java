package structural.composite;

import java.util.ArrayList;
import java.util.List;

public abstract class EmployeeComponent {
	
	protected String name;
	protected String function;
	protected List<EmployeeComponent> manages = new ArrayList<>();
	
	public String getName() {
		
		return name;
		
	}
	
	public String getFunction() {
		
		return function;
		
	}
	
	public abstract String display();
	
	String print() {
		
		StringBuilder sb = new StringBuilder(name);
		sb.append(":");
		sb.append(function);
		sb.append("\n");
		return sb.toString();
		
	}
	
	public void add(EmployeeComponent employee) {
		
		manages.add(employee);
		
	}
	
	public void remove(EmployeeComponent employee) {
		
		manages.remove(employee);
		
	}
	
}

package structural.composite;

import java.util.Iterator;

public class Manager extends EmployeeComponent{
	
	public Manager(String name, String function){
		
		this.name = name;
		this.function = function;
	}

	@Override
	public String display() {
		
		StringBuilder sb = new StringBuilder(print());
		
		Iterator<EmployeeComponent> itr = manages.iterator();
			
		while(itr.hasNext()) {
			sb.append(itr.next().display());
		}
		
		return sb.toString();
	}
	
}

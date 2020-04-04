package structural.facade;


public class Test {
	
	public static void main(String[] args) {
		
		WebServiceFacade employeeFacade = new WebServiceFacade("www.akshay.org");
		
		Employee emp1 = employeeFacade.getEmployee(1);
		System.out.println(emp1);
		
		Employee emp2 = employeeFacade.deleteEmployee(2);
		System.out.println(emp2);
		
	}
}

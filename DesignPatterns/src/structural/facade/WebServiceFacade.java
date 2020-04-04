package structural.facade;


public class WebServiceFacade {
	
	private String baseUrl;

	public WebServiceFacade(String baseUrl) {
		
		super();
		this.baseUrl = baseUrl;
		
	}
	
	public Employee getEmployee(int id) {
		//HTTP code to web service to get employee: baseUrl + "/employee/get/id" goes here
		
		System.out.println("Invoking URL: " + baseUrl + "/employee/get/"+ id);
		Employee e = new Employee();
		e.setId(id);
		e.setName("Test");
		
		return e;
	}
	
	public Employee deleteEmployee(int id) {
		//HTTP code to web service to get employee: baseUrl + "/employee/id" goes here
		
		System.out.println("Invoking URL: " + baseUrl + "/employee/delete/"+ id);
		Employee e = new Employee();
		e.setId(id);
		e.setName("Test");
		
		return e;
	}
}

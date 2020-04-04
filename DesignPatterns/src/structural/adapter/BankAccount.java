package structural.adapter;


public class BankAccount implements Account {
	
	private long accountNumber;
	private String name;

	public BankAccount(long accountNumber, String name) {
		
		super();
		this.accountNumber = accountNumber;
		this.name = name;
		
	}

	@Override
	public long getAccountNumber() {
		
		return accountNumber;
		
	}

	@Override
	public String getName() {
		
		return name;
		
	}

	
	public void setAccountNumber(long accountNumber) {
		
		this.accountNumber = accountNumber;
		
	}

	
	public void setName(String name) {
		
		this.name = name;
		
	}

	@Override
	public String toString() {
		
		return "BankAccount [accountNumber=" + accountNumber + ", name=" + name + "]";
		
	}
}

package structural.adapter;


public class CreditCard {
	
	private long creditCardNumber;
	private String creditCardHolder;
	
	public CreditCard(long creditCardNumber, String creditCardHolder) {
		
		super();
		this.creditCardNumber = creditCardNumber;
		this.creditCardHolder = creditCardHolder;
		
	}

	public long getCreditCardNumber() {
		
		return creditCardNumber;
		
	}
	
	public void setCreditCardNumber(long creditCardNumber) {
		
		this.creditCardNumber = creditCardNumber;
		
	}
	
	public String getCreditCardHolder() {
		
		return creditCardHolder;
		
	}
	
	public void setCreditCardHolder(String creditCardHolder) {
		
		this.creditCardHolder = creditCardHolder;
		
	}

	@Override
	public String toString() {
		
		return "CreditCard [creditCardNumber=" + creditCardNumber + ", creditCardHolder=" + creditCardHolder + "]";
		
	}
}

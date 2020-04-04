package structural.adapter;


public class CreditCardAdapter implements Account{
	
	private CreditCard creditCard;

	public CreditCardAdapter(CreditCard creditCard) {
		
		super();
		this.creditCard = creditCard;
		
	}

	@Override
	public long getAccountNumber() {
		
		return creditCard.getCreditCardNumber();
		
	}

	@Override
	public String getName() {
		
		return creditCard.getCreditCardHolder();
		
	}

	@Override
	public String toString() {
		
		return creditCard.toString();
		
	}
}

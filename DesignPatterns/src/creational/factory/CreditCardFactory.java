package creational.factory;

public class CreditCardFactory {
	
	public CreditCard getCreditCard(CardType cardType) {
		
		switch(cardType) {
			
			case AMEX: return new AmexCreditCard();
			
			case VISA: return new VisaCreditCard();
			
			case MASTERCARD: return new MastercardCreditCard();
			
			default: return null;
		}
	}
}

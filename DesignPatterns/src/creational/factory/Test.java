package creational.factory;

public class Test {

	public static void main(String[] args) {
		
		CreditCardFactory factory = new CreditCardFactory();
		
		CreditCard amexCard = factory.getCreditCard(CardType.AMEX);
		
		CreditCard visaCard = factory.getCreditCard(CardType.VISA);
		
		CreditCard mastercard = factory.getCreditCard(CardType.MASTERCARD);
		
		System.out.println(amexCard);
		System.out.println(visaCard);
		System.out.println(mastercard);
	}
}

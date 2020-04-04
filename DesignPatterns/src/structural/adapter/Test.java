package structural.adapter;

import java.util.ArrayList;
import java.util.List;

public class Test {
	
	public static void main(String[] args) {
		
		List<Account> accountList = new ArrayList<>();
		
		AccountDaoStub accountDao = new AccountDaoStub();
		
		accountList.addAll(accountDao.getBankAccounts());
		
		//Wont compile:
		//accountList.addAll(accountDao.getCreditCardsAccounts());
		
		List<CreditCard> creditCardList = accountDao.getCreditCardsAccounts();
		
		for(CreditCard creditCard : creditCardList) {
			
			accountList.add(new CreditCardAdapter(creditCard));
		}
		
		System.out.println(accountList);

	}
}

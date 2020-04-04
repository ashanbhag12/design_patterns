package structural.adapter;

import java.util.ArrayList;
import java.util.List;

public class AccountDaoStub {
	
	public List<BankAccount> getBankAccounts(){
		
		List<BankAccount> bankAccountList = new ArrayList<>();
		
		bankAccountList.add(new BankAccount(1L, "Akshay"));
		bankAccountList.add(new BankAccount(2L, "Akshay S."));
		
		return bankAccountList;
	}
	
	public List<CreditCard> getCreditCardsAccounts(){
		
		List<CreditCard> creditCardList = new ArrayList<>();
		
		creditCardList.add(new CreditCard(101L, "Akshay"));
		creditCardList.add(new CreditCard(102L, "Akshay Shanbhag"));
		
		return creditCardList;
	}
}

package com.bank.application;
public class bankApplication {
	
	public static void main(String[] args) {
		Account myAccount=new Account("santhosh","29072000");
		System.out.println("AccountNumber : "+myAccount.getAccountNumber());
		System.out.println("NameOfAccountHolder : "+myAccount.getName());
		System.out.println("DataOfBirth : "+myAccount.getDob());
		
		Account myAccount1=new Account("vijay","30012001");
		System.out.println("-------------------------");
		System.out.println("NameOfAccountHolder : "+myAccount1.getName());
		System.out.println("DataOfBirth : "+myAccount1.getDob());
		System.out.println("AccountNumber : "+myAccount1.getAccountNumber());
		System.out.println("-------------------------");
		System.out.println("-------------------------");
		
		System.out.println("AccountNumber : "+myAccount.getAccountNumber());
		System.out.println("NameOfAccountHolder : "+myAccount.getName());
		System.out.println("DataOfBirth : "+myAccount.getDob());
	}

}

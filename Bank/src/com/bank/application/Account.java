package com.bank.application;

public class Account implements payment{
	private static long numberSetToAccount=254320000007432L;
	private long accountNumber;
	private String name;
	private String dob;
	
	public Account( String name, String dob) {
		super();
		//System.out.println("constructor class");
		this.name = name;
		this.dob = dob;
		this.accountNumber=numberSetToAccount++;
	}
	



	public long getAccountNumber() {
		return accountNumber;
	}




	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public String getDob() {
		return dob;
	}




	public void setDob(String dob) {
		this.dob = dob;
	}




	@Override
	public void Deposit(Double amount) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Withdraw(Double amount) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void CheckBalance() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Viewstatement() {
		// TODO Auto-generated method stub
		
	}
	


	
}

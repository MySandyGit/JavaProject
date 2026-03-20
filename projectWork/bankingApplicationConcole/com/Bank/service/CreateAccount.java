package com.Bank.service;

public class CreateAccount {
	
	private String name;
	private String Dob;
	private String phonenumber;
	   
	
	
	public CreateAccount(String name,String Dob ,String phonenumber){
		this.name=name;
		this.Dob=Dob;
		this.phonenumber=phonenumber;
		
	}
	
	//name
	private String getname() {
		return name;

	}
	private void setname() {
		

	}

	//date of birth
	private String getdob() {
		return Dob;

	}
	private void setdob() {
		

	}
	
	//phoneNumber
	
	private String getph() {
		return phonenumber;

	}
	private void setph() {
		

	}
}

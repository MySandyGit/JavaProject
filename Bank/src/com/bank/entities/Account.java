package com.bank.entities;
import java.util.*;
import java.util.concurrent.atomic.AtomicLong;
public class Account {
	private static AtomicLong generator = new AtomicLong(27890000000000L);
	
	private long accountNumber;
	private String name;
	private String dateOfBirth;
	private double balance;
	
	//--------------------------------
	
	private ATMCard atmCard;
	private List<Transaction> trasaction;
	
	public Account(String name2, String dob, double deposit) {
		this.accountNumber=generator.getAndIncrement();
		this.name=name;
		this.dateOfBirth=dateOfBirth;
		this.balance=balance;
		this.atmCard=new ATMCard();
		this.trasaction=new ArrayList<>();
		
		trasaction.add(new Transaction("Account Created",deposit));
	}

	public String getMaskedAccountNumber() {
		String acc =String.valueOf(accountNumber);
		return "xxxxxx" + acc.substring(acc.length()-4)
	}
	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public ATMCard getAtmCard() {
		return atmCard;
	}

	
	public List<Transaction> getTrasaction() {
		return trasaction;
	}

	public List<Transaction> getTrasaction() {
		// TODO Auto-generated method stub
		return null;
	}

	

}

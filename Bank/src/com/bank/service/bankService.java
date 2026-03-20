package com.bank.service;
import com.bank.entities.*;
import java.util.*;
public class bankService {
	
	private Map<Long, Account> accounts=new HashMap<>();
	
	public Account createAccount(String name,String dob,double deposit) {
		Account acc=new Account(name,dob,deposit);
		accounts.put(acc.getAccountNumber(),acc);
		return acc;
	}

	public Account getAccount(long accNo) throws Exception {
		Account acc = accounts.get(accNo);
		if(acc == null)
			throw new Exception("Account Not Found");
		return acc;
	}
	
	  public void deposit(long accNo, double amount) throws Exception {
	        Account acc = getAccount(accNo);
	        acc.setBalance(acc.getBalance() + amount);
	        acc.getTrasaction().add(
	                new Transaction("Deposit", amount));
	    }

	    public void withdraw(long accNo, double amount) throws Exception {
	        Account acc = getAccount(accNo);

	        if(acc.getBalance() < amount)
	            throw new Exception("Insufficient Balance");

	        acc.setBalance(acc.getBalance() - amount);
	        acc.getTrasaction().add(
	                new Transaction("Withdraw", amount));
	    }

	    public void transfer(long sender, long receiver, double amount)
	            throws Exception {

	        Account s = getAccount(sender);
	        Account r = getAccount(receiver);

	        if(s.getBalance() < amount)
	            throw new Exception("Insufficient Balance");

	        s.setBalance(s.getBalance() - amount);
	        r.setBalance(r.getBalance() + amount);

	        s.getTrasaction().add(
	                new Transaction("Transfer to " + r.getMaskedAccountNumber(), amount));

	        r.getTrasaction().add(
	                new Transaction("Received from " + s.getMaskedAccountNumber(), amount));
	    }

	    public void showPassbook(long accNo) throws Exception {
	        Account acc = getAccount(accNo);
	        for(Transaction t : acc.getTrasaction()) {
	            System.out.println(t);
	        }
	    }
	}
	

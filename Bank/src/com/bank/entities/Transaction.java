package com.bank.entities;
import java.time.LocalDateTime;
import java.util.UUID;
public class Transaction {

	private String id;
	private String type;
	private double amount;
	private LocalDateTime date;


	public Transaction(String string, double amount2) {
		this.id=UUID.randomUUID().toString().substring(0,8);
		this.type=type;
		this.amount=amount;
		this.date=LocalDateTime.now();
	}



	public String toString() {
		return id + " | " + date + " | " + type + " | ₹" +amount;
				
	}
}

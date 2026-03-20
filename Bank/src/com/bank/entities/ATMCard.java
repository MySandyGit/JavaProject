package com.bank.entities;
import java.util.Random;
public class ATMCard {

	private String cardNumber;
	
	public ATMCard() {
	Random r =new Random();
	this.cardNumber="3456" +(1000000 + r.nextInt(90000000));
	}
	public String getMakedCard() {
		return "xxxx-xxxx-" +
	           cardNumber.substring(cardNumber.length()-4);
	}

}

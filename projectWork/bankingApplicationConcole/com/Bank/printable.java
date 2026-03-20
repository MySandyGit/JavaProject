package com.Bank;

public class printable {
	

	void printBalance(String Date,String Detailes,Double Deposit, Double Withdrawal,Double Balance ) {
		System.out.println("+--------------------+--------------------+----------+----------+----------+");
		
		System.out.printf("|%-20s|%-20s|%-10s|%-10s|%-10s|\n",
				"Date","Detailes","Deposit","Withdrawal","Balance");
		System.out.println("|--------------------+--------------------+----------+----------+----------|");
		System.out.printf("|%-20s|%-20s|%-10f|%-10f|%-10f|\n",Date,Detailes,Deposit,Withdrawal,Balance);
		System.out.println("|--------------------+--------------------+----------+----------+----------|");
		System.out.println("|--------------------+--------------------+----------+----------+----------|");
		System.out.println("|--------------------+--------------------+----------+----------+----------|");
	}
}

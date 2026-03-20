package com.Bank.service;

public class bankStatmentBox {
	
	    public static void main(String[] args) {

	        // Sample Data
	        String date1 = "01-02-2026";
	        String detail1 = "Salary";
	        double credit1 = 5000.00;
	        double debit1 = 0.00;
	        double balance1 = 5000.00;

	        String date2 = "03-02-2026";
	        String detail2 = "Groceries";
	        double credit2 = 0.00;
	        double debit2 = 1200.00;
	        double balance2 = 3800.00;

	        // Print Top Border
	        System.out.println("+------------+----------------+------------+------------+---------------+");

	        // Print Header
	        System.out.printf("| %-10s | %-14s | %-10s | %-10s | %-13s |\n",
	                "Date", "Detail", "Credit", "Debit", "Balance");

	        // Print Middle Border
	        System.out.println("+------------+----------------+------------+------------+---------------+");

	        // Print Row 1
	        System.out.printf("| %-10s | %-14s | %10.2f | %10.2f | %13.2f |\n",
	                date1, detail1, credit1, debit1, balance1);

	        // Print Row 2
	        System.out.printf("| %-10s | %-14s | %10.2f | %10.2f | %13.2f |\n",
	                date2, detail2, credit2, debit2, balance2);

	        // Print Bottom Border
	        System.out.println("+------------+----------------+------------+------------+---------------+");
	    }
	}




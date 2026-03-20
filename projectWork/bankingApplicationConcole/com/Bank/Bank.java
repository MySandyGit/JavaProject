package com.Bank;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.*;
import com.Bank.dateandtime;
import com.Bank.service.*;
public class Bank extends viewPassbook{

	public static void main(String[] args) {
		System.out.println("         ----------Welcome To BankOfWorld----------      ");
		dateandtime dt =new dateandtime();
		
		viewPassbook view=new viewPassbook(); 
		Scanner sc=new Scanner(System.in);
		System.out.println("Do Have an Account in our (yes/no) ? ");
		String y=sc.next();
		String detail=null;
		Double deposit=0.0000;
		Double withdrow=0.0000;
		Double balance=0.0000;
		
		
		if(y.equals("yes") || y.equals("Yes") || y.equals("YES") ){
			System.out.println("i have");
		}
		else if((y.equals("no") || y.equals("No") || y.equals("NO") )) {
		System.out.println("If you wanna create Account (yes/no) ? ");
		String y1=sc.next();
		
		if(y1.equals("yes") || y1.equals("Yes") || y1.equals("YES") ){
			System.out.println("	Select the account type :");
			System.out.println("     1.CurrentAccount");
			System.out.println("     2.SevingsAccount");
			int type=sc.nextInt();
			try {
				switch(type) {
				case 1:
				    System.out.println("Enter the Below detail :");
				    System.out.print("Enter Name : ");
				    String name1=sc.next();
				    System.out.println();
				    System.out.println("Enter Date of birth : ");
				    String dob1=sc.next();
				    System.out.println("Enter PhoneNumber: ");
				    String  ph1=sc.next();
				    CreateAccount create=new CreateAccount(name1,dob1,ph1);
				    view.printBalance(dt.DandT(),detail,deposit,withdrow,balance);
					System.out.println("CurrentAccount successfully created");
					System.out.println();
					System.out.println("         ----------Welcome To BankOfWorld----------      ");
				    break;
				case 2:
					System.out.println("Enter the Below detail :");
				    System.out.print("Enter Name : ");
				    String name=sc.next();
				    System.out.println();
				    System.out.println("Enter Date of birth : ");
				    String dob=sc.next();
				    System.out.println("Enter PhoneNumber: ");
				    String  ph=sc.next();
				    CreateAccount create2=new CreateAccount(name,dob,ph);
				    
					view.printBalance(dt.DandT(),detail,deposit,withdrow,balance);
			       System.out.println("SevingsAccount successfully created");
			       System.out.println();
				   System.out.println("         ----------Welcome To BankOfWorld----------      ");
			       break;
				}

			}catch(ArithmeticException e){
				System.out.println("Pleas enter 1 or 2");
				
			}
		
		}
	}
		
		 
		
		
		
		
		
//		printable pr=new printable();
//		pr.printBalance();
	}

}

package Banking_application;

import java.util.Scanner;

public class bannking_simple_application {
	static Scanner sc=new Scanner(System.in);
	static double balance=0;
	public static void main(String[] args) {
		int option;
		do {
			
			System.out.println("1.Create Account. \n"
					+ "2.Deosite Amount. \n"
					+ "3.Withdral Amount. \n"
					+ "4.Current Balance. \n"
					+ "0.Exit. \n");
			System.out.println("Enter your Option:");
			option=sc.nextInt();
			switch(option) {
			case 1:
				create_acount();
				break;
			
			case 2:
				deposite_amount();
				break;
			case 3:
				withdral_amount();
				break;
			
			case 4:
				current_balnce();
				break;
				
			case 0:
				System.out.println("Exit From Banking Application");
				break;
				
			default:
				System.out.println("Invalid Option");
				break;
			}
			
		}while(option!=0);
	
		
		

	}
	
	static void create_acount() {
		System.out.println("Enter User Name:");
		String name=sc.next();
		
		System.out.println("Enter Balance Amount: ");
		int amount=sc.nextInt();
		balance+=amount;
		
	}
	
	static void deposite_amount() {
		System.out.println("Enter Deposite Amount: ");
		int depo_amount=sc.nextInt();
		
		balance+=depo_amount;
		
		System.out.println("Balance After Deposite: "+balance);
		 
	}
	
	static void withdral_amount() {
		System.out.println("Enter Withdrwal Amount:");
		int with_amount=sc.nextInt();
		
		balance-=with_amount;
		
		System.out.println("Balance After Withdrawal: "+balance);
		
		
	}
	
	static void current_balnce() {
		System.out.println("Current Balance: "+balance);
	}

}

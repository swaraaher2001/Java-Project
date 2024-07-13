package Banking_application;

import java.util.Scanner;
class bankdetail{
	Scanner sc=new Scanner(System.in);
	private String acc_no;
	private String acc_name;
	private String acc_type;
	private long balance;
	
	public void openaccount() {
		System.out.println("Enter Account No:");
		acc_no=sc.next();
		
		System.out.println("Enter Account Holder Name:");
		acc_name=sc.next();
		
		System.out.println("Enter Account Type:");
		acc_type=sc.next();
		
		System.out.println("Enter Account Holder Balance:");
		balance=sc.nextLong();
	}
	
	public void showaccount() {
		System.out.println("Account No:"+acc_no);
		System.out.println("Account Holder Name is:"+acc_name);
		System.out.println("Account Type:"+acc_type);
		System.out.println("Account Balance:"+balance);
	}
	
	public void deposite() {
		System.out.println("Enter Deposite Amount You Want:");
		int depo_amount=sc.nextInt();
		
		balance+=depo_amount;
		
		System.out.println("Balance Amount is"+balance);
	}
	
	public void withdrawal() {
		System.out.println("Enter withdrawal Amount You Want:");
		int with_amount=sc.nextInt();
		
		if(with_amount<=balance) {
			balance+=with_amount;
			System.out.println("Balance Amount is"+balance);
		}
		else {
			System.out.println("Insufficient Balance");
		}
	}
	
	public boolean search(String ac_no) {
		
		if(acc_no.equals(ac_no)) {
			showaccount();
			return(true);
		}
		return (false);
		
	}
}

public class banking_application_using_class_array {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter How Much User You Want Add:");
		int n=sc.nextInt();
		
		bankdetail c[]=new bankdetail[n];
		
		for(int i=0;i<c.length;i++) {
			c[i]=new bankdetail();
			c[i].openaccount();
		}
		 
		int option;
		do {
			System.out.println("****************************** \n"
					+ "1.Display All Account Details. \n"
					+ "2.Search Account. \n"
					+ "3.Deposite Amount. \n"
					+ "4. Withdrawal Amount. \n"
					+ "0.Exit\n"
					+ "****************************** ");
			
			System.out.println("Enter Option You Want:");
			option=sc.nextInt();
			
			switch(option) {
			
			case 1:
				
				for(int i=0;i<c.length;i++) {
					c[i].showaccount();
				}
				break;
			
			case 2:
				System.out.println("Enter Acount No. Serach:");
				String ac_no=sc.next();
				boolean found=false;
				
				for(int i=0;i<c.length;i++) {
					found=c[i].search(ac_no);
					if(found) {
						break;
					}	
				}
				
				if(!found) {
					System.out.println("Invalid search");
				}
				break;
			
			case 3:
				System.out.println("Enter Acount No. Serach:");
				ac_no=sc.next();
				
				found=false;
				for(int i=0;i<c.length;i++) {
					found=c[i].search(ac_no);
					if(found) {
						c[i].deposite();
						break;
					}
				}
				if(!found) {
					System.out.println("Account Not Found");
				}
				break;
			
			case 4:
				System.out.println("Enter Acount No. Serach:");
				ac_no=sc.next();
				
				found=false;
				for(int i=0;i<c.length;i++) {
					found=c[i].search(ac_no);
					if(found) {
						c[i].withdrawal();
						break;
					}
					
				}
				if(!found) {
					System.out.println("Invalid Search......");
				}
				break;
				
			case 0:
				System.out.println("Exit From Application!Thank you ☻.......");
				break;
				
			default:
				System.out.println("Invalid Choise.......");
				break;	
			}
			
			
		}while(n!=0);
		

	}
}

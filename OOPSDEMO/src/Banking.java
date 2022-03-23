import java.util.Scanner;
public class Banking {
	
	Scanner sc = new Scanner(System.in); 
	     int accno;  
	     String name;  
	     String acc_type;  
	     double balance;
	     double mobile;
	     String email;
	     
	     void OpenAccount() {
	    	 System.out.print("Enter Account Type: ");
	         acc_type = sc.next();
	        // System.out.print("Enter Account No: ");
	         //accno = sc.next();
	         accno= Math.random()*100;
	         System.out.print("Enter Name: ");
	         name = sc.next();
	         System.out.print("Enter Email: ");
	         name = sc.next();
	         System.out.print("Enter Mobile: ");
	         name = sc.next();
	         System.out.print("Enter Balance: ");
	         balance = sc.nextLong();
	     }
	     
	     void show() {
	         System.out.println("Account Type"+acc_type+","+ "Account_No:"+accno + ","+"Name" + name + ","+"Balance" + balance);
	     }
	     
	     void deposit() {
	         double amt;
	         System.out.println("Enter amount to Deposit : ");
	         amt = sc.nextDouble();
	         balance = balance + amt;
	     }
	     
	     void withdraw() {
	         double amt;
	         System.out.println("Enter amount to withdraw : ");
	         amt = sc.nextDouble();
	         if (balance >= amt) {
	             balance = balance - amt;
	         } 
	         else{
	             System.out.println("Transaction Failed!!");
	         }
	     }
	     
	     
	   
	public static void main(String[] args)
	{
		Banking obj = new Banking();
		
		obj.OpenAccount();
		obj.show();
		obj.deposit();
		obj.withdraw();
		
	}

}

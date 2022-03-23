import java.util.Scanner;

public class ThrowEx {
	
	static void checkEligibility(int stuage,int stuweight) {
		if(stuage<12 && stuweight<40) {
			throw new ArithmeticException("Not Eleg");
		}
		else
		{
			System.out.println("Valid entry");
		}
	}

	public static void main(String[] args) {
		System.out.println("Welcome to registration process");
		int age,wt;
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter the age of student");
		age=sc.nextInt();
		
		System.out.println("Enter the weightof student");
		wt=sc.nextInt();
		
		checkEligibility(age,wt);
		System.out.println("Have A Nice Day!!");
		
		
		
		

	}

}

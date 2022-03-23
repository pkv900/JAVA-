import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of A and B");
		int a = sc.nextInt();
		int b = sc.nextInt();
		double result;
		
		 System.out.println("Choose Operator: +, -, *, /,%");
		 char op = sc.next().charAt(0);
		 
		 switch (op) {

	    
	      case '+':
	        result = a + b;
	        System.out.println(a + " + " + b + " = " + result);
	        break;

	    
	      case '-':
	        result = a - b;
	        System.out.println(a + " - " + b + " = " + result);
	        break;

	    
	      case '*':
	        result = a * b;
	        System.out.println(a + " * " + b + " = " + result);
	        break;

	     
	      case '/':
	        result = a / b;
	        System.out.println(a + " / " + b + " = " + result);
	        break;

	      case '%':
	    	  result=a%b;
	    	  System.out.println(a + " % " + b + " = " + result);
		      break;
	    	  
	      default:
	        System.out.println("Enter Correct Operator");
	        break;
	    }
		 
	}

}

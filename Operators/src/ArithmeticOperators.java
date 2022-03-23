import java.util.Scanner;
public class ArithmeticOperators 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter the value of A and B");
	int a = sc.nextInt();
	int b = sc.nextInt();
	
	int add=a+b;
	int sub=a-b;
	double div=a/b;
	double mul=a*b;
	double mod=a%b;
	
	System.out.println("Addition:"+add);
	System.out.println("Subtraction:"+sub);
	System.out.println("Division:"+div);
	System.out.println("Multiplication:"+mul);
	System.out.println("Modulus:"+mod);
	

	}
}

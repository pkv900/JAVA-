import java.util.Scanner;
public class BitwiseOperator {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of A and B");
		int a = sc.nextInt();
		int b = sc.nextInt();
		double and=a&b;
		double or=a|b;
		double nor=a^b;
		double shift=a>>b;
		
		System.out.println("And operation:"+and);
		System.out.println("And operation:"+or);
		System.out.println("And operation:"+nor);
		System.out.println("And operation:"+shift);
		
		
		
	}
}
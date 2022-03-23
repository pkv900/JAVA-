import java.util.Scanner;
public class LogicalOperators {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of A and B");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
				
		System.out.println((a>b)&& (a==b));
		System.out.println((a<b)||(b>c));
		
		
	}
}
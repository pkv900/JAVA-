import java.util.Scanner;
public class RelationalOperators {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of A and B");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println(a==b);
		System.out.println(a>=b);
		System.out.println(a<=b);
		System.out.println(b>=a);
		System.out.println(a!=b);
		
		
	}
}
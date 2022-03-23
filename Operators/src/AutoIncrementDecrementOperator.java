import java.util.Scanner;
public class AutoIncrementDecrementOperator {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of A and B");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("A++="+ a++);
		System.out.println("++A="+ ++a);
		System.out.println("B++="+ ++b);
		System.out.println("++B="+ ++b);
	}

}

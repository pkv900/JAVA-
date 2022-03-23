import java.util.Scanner;
public class TerneryOperator {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of A and B");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int result = (a=b) ? "A and B are not equal" : "A and B are equal";
		System.out.println(result);
	}
}
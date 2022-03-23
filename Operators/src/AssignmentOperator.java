import java.util.Scanner;
public class AssignmentOperator {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the value of A and B");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println("Values of A and B before Swapping:"+a+","+b);
		
		int temp=0;
		temp=a;
		a=b;
		b=temp;
		
		System.out.println("Values of A and B after Swapping:"+a+","+b);
		
		
	}

}

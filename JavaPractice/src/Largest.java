import java.util.Scanner;
public class Largest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of A and B");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(a>b)
		{
			System.out.println("A is largest");
		}
		else
			System.out.println("B is largest");
			
	}

}

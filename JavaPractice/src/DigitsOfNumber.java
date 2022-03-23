import java.util.Scanner;
public class DigitsOfNumber {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Number");
		int n = sc.nextInt();
		
		if((n<100)&&(n>1))
		{
			System.out.println("2 Digit Number");
		}
		else if((n>100)&&(n<1000))
		{
			System.out.println("3 Digit Number");
		}
		else if((n>1000)&&(n<10000))
		{
			System.out.println("4 Digit Number");
		}
		else if((n>10000)&&(n<100000))
		{
			System.out.println("5 Digit Number");
		}
		else if((n>100000)&&(n<999999))
		{
			System.out.println("6 Digit Number");
		}
		
	}
}

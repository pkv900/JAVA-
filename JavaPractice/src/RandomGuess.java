//import java.util.*;
import java.util.Scanner;
public class RandomGuess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while(true)
		{
		int number = (int)(Math.random());
		int flag = 0;
		
		do {
	
				System.out.println("Guess a number between 1 and 100");
				int n= sc.nextInt();
				
				if(number<n)
				{
					System.out.println(n+"is too low.Try again.");
				}
				else if(number>n)
				{
					System.out.println(n+"is too high.Try again.");
				}
				else
				{
					System.out.println(n+"is correct.You win.");
				}		
			}
		
		}while(flag==0);
			System.out.println("Would you like to play again?(y/n)");
			char ch = sc.next().charAt(0);
			if(ch=='Y'||ch=='y')
			{
				continue;
			}
			else
			{
				break;
			}
	
	}	
		}
		




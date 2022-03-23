import java.util.Scanner;
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the limit");
		int limit = sc.nextInt();

		int n1=0;
		int n2=1,n3;
		int i;
		
		while(i<limit) {
			n3=n1+n2;
			System.out.println(""+n3);
			n1=n2;
			n2=n3;
			
			i++;
		}
		
		}
		
	}



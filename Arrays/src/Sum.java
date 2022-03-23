import java.util.Scanner;
public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		int n[]=new int[10];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Elements");
		for(int i=0;i<5;i++)
		{
			n[i]=sc.nextInt();
			sum=sum+n[i];
			
		}
		System.out.println("Total="+sum);

	}

}

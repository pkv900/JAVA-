import java.io.*;
import java.util.*;
class banktransaction
{
	int bal=500,amount,n,id;
	Scanner s=new Scanner(System.in);
	String s1=new String();
	
	banktransaction()
	{
		System.out.println("Enter the name of the person:");
		s1=s.nextLine();
		System.out.println("Enter the person ID:");
		id=s.nextInt();
	}
	
	public void deposit()
	{
		System.out.println("Enter amount to be deposited");
		amount=s.nextInt();
		bal=bal+amount;
	}
	
	protected void draw()
	{
		if(bal>500)
		{
			System.out.println("Enter the amount to be draw");
			n=s.nextInt();
			if(n%100==0)
			{
				bal=bal-n;
				System.out.println("Draw amount is:"+n);
			}
			else
				System.out.println("Can not possible this amount");
		}
		else
			System.out.println("Cannot possible");
		
			}
		}
	}
}

public void enquiry()
{
	System.out.println("Name of the person:"+s1);
	System.out.println( "Person ID:"+id);
	System.out.println("Account Balance:"+bal);
}

public class BankDetails {

	public static void main(String[] args) {
		
		banktransaction gv=new banktransaction();
		int ch;
		Scanner t=new Scanner(System.in);
		System.out.println("1.Deposit:");
		System.out.println("2.Draw:");
		System.out.println("3.Enquiry:");
		while(true)
		{
			System.out.println("Enter Your CHoice:");
			switch(ch)
			{
			case 1: gv.deposit();
			break;
			case 2: gv.draw();
			break;
			case 3: gv.enquiry();
			break;
			default:
				return;
				
			}
		}
	}

}

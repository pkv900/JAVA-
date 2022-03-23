import java.util.Arrays;

public class AscDscSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[]= {50,20,45,82,25,63};
		int I =num.length;
		int i,j,t;
		System.out.println("Given Number:");
		for(i=0;i<I;i++)
		{
			System.out.println(""+num[i]);
		}
		System.out.println("\n");
		System.out.println("Ascending Order Number:");
		Arrays.sort(num);
		for(i=0;i<I;i++)
		{
			System.out.println(""+num[i]);
		}
		
	}

}

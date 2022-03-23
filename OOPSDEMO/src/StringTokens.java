import java.util.*;
public class StringTokens{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		String s1="This is good for none";
		StringTokenizer st1 = new StringTokenizer(s1);
		System.out.println("No. of words:"+st1.countTokens());
		sum=st1.countTokens()-1;
		while(st1.hasMoreTokens())
			sum=sum+st1.nextToken().length();
		System.out.println("No. of Chars:"+sum);
	}

}

import java.util.ArrayList;
public class GenericTest {

	public static void main(String[] args) {
		
		//creation of ArrayList 
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("Rohit");
		al.add("Virat");
		al.add("2");
		
		
		String s1 = al.get(0);
		String s2 = al.get(1);
		
		//Runtime Exception
		String s3 = al.get(2);
		
		System.out.println(s1+""+s2+""+s3);
		
	}

}

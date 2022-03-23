
import java.util.LinkedHashSet;

public class LinkedHashSetDemoEx {

	public static void main(String[] args) {
		
		//LinkedHashSet of String type
		LinkedHashSet<String> lhset = new LinkedHashSet<String>();
		
		lhset.add("Z");
		lhset.add("PQ");
		lhset.add("N");
		lhset.add("O");
		lhset.add("KK");
		System.out.println(lhset);

		//LinkedHashSet of Integer type
		LinkedHashSet<Integer> lh = new LinkedHashSet<Integer>();
	
		lh.add(1);
		lh.add(2);
		lh.add(7);
		lh.add(5);
		lh.add(9);
		System.out.println(lh);
		
		
	}

}

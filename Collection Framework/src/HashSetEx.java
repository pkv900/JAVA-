import java.util.HashSet;

public class HashSetEx {

	public static void main(String[] args) {
		
		//Declaring the hashset
		HashSet<String> hset= new HashSet<String>();
		
		hset.add("Apple");
		hset.add("Grapes");
		hset.add("Oranges");
		hset.add("Kiwi");
		hset.add("Banana");
		
		System.out.println(hset);
		
		hset.add("Apple");
		hset.add("mango");
		System.out.println(hset);
		
		hset.add(null);
		hset.add(null);
		
		System.out.println(hset);
		
		
		
		hset.isEmpty();
		
		hset.remove("Apple");
		
		hset.size();
		
		
		
		

	}

}

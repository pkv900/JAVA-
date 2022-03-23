import java.util.*;
import java.util.HashMap;

public class HashMapExample {

	public static void main(String[] args) {
		
		HashMap<Integer,String> hmap = new HashMap<Integer,String>();
		
		//Adding elements to map
		hmap.put(12,"Name1");
		hmap.put(2,"Name2");
		hmap.put(7,"Name3");
		hmap.put(49,"Name4");
		hmap.put(3,"Name5");
		hmap.put(36,"Name6");
		
		//System.out.println(hmap);

		Set set = hmap.entrySet();
		Iterator it = new set.iterator();
		
		while(it.hasNext())
		{
			Map.Entry mentry = (Map.Entry) it.next();
			System.out.println("Hey is:"+mentry.getkey()+"\nValue is "+mentry.getvalue());
			
		}
		
		 Scanner obj = new Scanner(System.in);
	     System.out.println("Enter the key to be searched");
	     
		
		
	}

}

import java.util.*;

public class HashSetDemo2 {

	public static void main(String[] args) {
		
		Set<String>nameSet = new HashSet<String>();
		
		nameSet.add("Chris");
		nameSet.add("David");
		nameSet.add("Katherine");
		nameSet.add("Kenny");
		
		//Getting a iterator for the set.
		Iterator it = nameSet.iterator();
		
		//Displaying elements of the list
		System.out.println("Here are the names in the set.");
		while(it.hasNext())
			System.out.println(it.next());
		
		System.out.println();
		
		//Search for "Katherine" to find this name in the nameset.
		if(nameSet.contains("Katherine"))
			System.out.println("Katherine is in the set.");
		else
			System.out.println("Katherine is Not in the set.");
		
		//Search for "Bethany" to find this name in the nameset.
		if(nameSet.contains("Bethany"))
			System.out.println("Bethany is in the set.");
		else
			System.out.println("Bethany is Not in the set.");
	}

}

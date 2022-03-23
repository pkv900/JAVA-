import java.util.LinkedList;
import java.util.Iterator;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		LinkedList<String> ls = new LinkedList<String>();
		
		//Adding elements to the linked list
		ls.add("Name1");
		ls.add("Name2");
		ls.add("Name3");
		
		System.out.println(ls);
		
		//Adding the element to the Index1
		ls.addFirst("Megan");
		System.out.println(ls);
		
		//Adding an element to the last of the list
		ls.addLast("Angelinna");
		System.out.println(ls); 
		
		//Adding an element to the third position
		ls.add(2,"Maxwell");
		System.out.println(ls);
		
		//Iterating over the list
		Iterator<String> it = ls.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());

			ls.set(3, "Changed");
			System.out.println(ls); 
			
			ls.remove("Maxwell");
			System.out.println(ls); 
			
			
			ls.addFirst("First");
			System.out.println(ls); 
			
			
			ls.get(1);
			System.out.println(ls); 
			
			ls.indexOf("Megan");
			System.out.println(ls); 
			
			
			ls.size();
			System.out.println(ls); 
			
			
			
		}
		
	}

}

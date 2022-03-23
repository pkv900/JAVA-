
import java.util.ArrayList;
public class ArraylistDemo {
		
	public static void main(String[] args) {
		
		//Creating Arraylist of names
		ArrayList<String> names =new ArrayList<String>();
		
		names.add("NAME1");
		names.add("NAME2");
		names.add("NAME3");
		names.add("NAME4");
		
		//Displaying the Arraylist
		System.out.println(names);
		
		//Adding NAME5 at  2nd Index
		names.add(2,"NAME5");
		System.out.println(names);
		
		//Rename
		names.set(0,"Divyanshu Bharti");
		System.out.println(names);
		
		//Remove name
		names.remove(3);
		System.out.println(names);

		//Iterate over the list
		for(String name:names)
			System.out.println(name);
		
		
		
		
	}

}

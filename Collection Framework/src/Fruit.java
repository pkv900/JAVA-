import java.util.ArrayList;
import java.util.Collections;
public class Fruit {

	public static void main(String[] args) {
ArrayList<String> fruits =new ArrayList<String>();
		
		fruits.add("Apple");
		fruits.add("Grapes");
		fruits.add("Oranges");
		fruits.add("Banana");
		fruits.add("Kiwi");
		fruits.add("Pear");
		fruits.add("Melon");
		fruits.add("Watermelon");
		fruits.add("Coconut");
		fruits.add("Papaya");
		
		System.out.println(fruits);
		
		Collections.sort(fruits);
		
		for( String fruit:fruits)
			System.out.println(fruits);

	}

}

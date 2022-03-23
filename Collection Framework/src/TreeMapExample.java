import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Iterator;

public class TreeMapExample {

	public static void main(String[] args) {
		
		TreeMap<Integer,String>tmap = new TreeMap<Integer,String>();
		
		//Adding elements
		tmap.put(1,"Python");
		tmap.put(23,"Java");
		tmap.put(70,"ML");
		tmap.put(3,"Android");
		tmap.put(2,"Spring");

		System.out.println(tmap);
		
		//displaying content using Iterator
		Set set = tmap.entrySet();
		Iterator it = set.iterator();
		while(it.hasNext())
		{
			Map.Entry mentry = (Entry)it.next();
			System.out.println("Key is:"+mentry.getKey()+"& value is:");
			System.out.println(mentry.getValue());
		}
}
}

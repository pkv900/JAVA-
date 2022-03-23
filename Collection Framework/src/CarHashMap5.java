import java.util.*;
public class CarHashMap5 {

	public static void main(String[] args) {
		
		//Creating a TreeMap to store car objects
		SortedMap<String,Car> carMap = new TreeMap<String,Car>();
		
		//Creating Car objects
		Car vw = new Car("227H54","1997 Volkswagaon");
		Car mustang = new Car("448A69","1965 Mustang");
		Car porsche = new Car("453B55","2007 Porsche");
		Car bmw = new Car("177R60","1980 BMW");

		//putting mappings into the TreeMap.In each mapping,the car's vin is key and the 		Car object containing that  VIN is the value.
		carMap.put(vw.getKey(),vw);
		carMap.put(mustang.getVin(), mustang);
		carMap.put(porsche.getVin(), porsche);
		carMap.put(bmw.getVin(),bmw);
		
		//Getting a set containing the mappings in this map.
		Set<Map.Entry<String,Car>>cars=carMap.entrySet();
		
		
		//Iterate through the mappings,printing each one.
		System.out.println("Here are the mappings:");
		for(Map.Entry<String,Car>entry:cars)
		{
			System.out.println("Key="+entry.getKey());
			System.out.println("Value="+entry.getValue());
			System.out.println();
			
		}
		
		
	}

}

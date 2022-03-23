import java.util.*;
public class CarHashMap1 {

	public static void main(String[] args) {
		
		//Creating a TreeMap to store car objects
		Map<String,Car>carMap= new HashMap<String,Car>();
		
		//Creating Car objects
		Car vw = new Car("227H54","1997 Volkswagaon");
		Car mustang = new Car("448A69","1965 Mustang");
		Car porsche = new Car("453B55","2007 Porsche");
		Car bmw = new Car("177R60","1997 BMW");
		
		//putting mappings into the TreeMap.In each mapping,the car's vin is key and the 		Car object containing that  VIN is the value.
		carMap.put(vw.getVin(),vw);
		carMap.put(mustang.getVin(), mustang);
		carMap.put(porsche.getVin(), porsche);
		carMap.put(bmw.getVin(),bmw);
		
		System.out.println("\nSearching for the car with"+"VIN"+mustang.getVin());
		Car foundCar = carMap.get(mustang.getVin());
		
		
		if(foundCar!=null)
			System.out.println(foundCar);
		else
			System.out.println("The Mustang is not in the set.");
		
		System.out.println("\nSearching for the car with"+"VIN 911C87");
		
		foundCar = carMap.get("911C87");
		
		if(foundCar!=null)
			System.out.println(foundCar);
		else
			System.out.println("The Mustang is not in the set.");
		
			
	}

}

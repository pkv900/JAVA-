import java.util.Set;
import java.util.Iterator;
import java.util.HashSet;
public class Car {
	
		String vin,description;
		public boolean equals(Object other)
		{
			if(!(other instanceof Car))
				return false;
			else
				return  vin.equalsIgnoreCase(((Car)other).vin);
			
		}
		
		public int hasCode() {
			return vin.hashCode();
			
		}
		
		public Car(String v,String d) {
			vin=v;
			description=d;
			
		}
		
		public String toString()
		{
			return vin+""+description;
		}
	
		public static void main(String[] args)
		{
			Set<Car> carSet = new HashSet<Car>();
			Car[] myRides= {
					new Car("TJ1","Toyota"),new Car("GM1","Corvette"),
					new Car("TJ1","Toyota Corolla")
			};
			
			//Adding Cars to Hashset
			for(Car c:myRides)
				carSet.add(c);
			
			//Printing list
			Iterator it =carSet.iterator();
			while(it.hasNext())
				System.out.println(it.next());
		}
	

}

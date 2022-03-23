import java.util.*;

public class TreeSetDemo2 {
	

	public static void main(String[] args) {
		
		SortedSet<Car>(new CarComparator<Car>());
		
		carSet.add(new Car("227h54","1997 Volkswagon"));
		carSet.add(new Car("453B55","2007 Porsche"));
		carSet.add(new Car("177R60","1980 BMW"));
		carSet.add(new Car("448A69","1965 Mustang"));
		
		System.out.println("Here are the cars sorted in"+"orcer of theirs VINs:");
		for(car car:carSet)
			System.out.println(car);
	}

}

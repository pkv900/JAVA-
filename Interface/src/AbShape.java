
abstract class Shape
{
	public abstract void numberOfSides();
}

class Trapezoid extends Shape
{
	public void numberOfSides() {
		System.out.println("No. of sides:"+4);
	}
}

class Hexagon extends Shape
{
	public void numberOfSides() {
		System.out.println("No. of sides:"+6);
	}
}

class Triangle extends Shape
{
	public void numberOfSides() {
		System.out.println("No. of sides:"+3);
	}
}

public class AbShape
{
	public static void main(String[] args)
	{
		Shape s;
		s= new Trapezoid();
		s.numberOfSides();
		s= new Hexagon();
		s.numberOfSides();
		s = new Triangle();
		s.numberOfSides();
		
	}
}




















public class AbShape {
	

}

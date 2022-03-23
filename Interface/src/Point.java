
abstract class Shape
{
	public String color;
	public Shape() {
	}
	public void setColor(String c)
	{
		color=c;
	}
	public void getColor()
	{
		return color;
	}
	abstract public double area();
}


public class Point extends Shape {

	static int x,y;
	public Point() {
		x=0;
		y=0;
	}
	
	public double area()
	{
		return 0;
		
	}
	
	public double parameter()
	{
		return 0;
		
	}
	
	public static void print()
	{
	System.out.println("Point:"+x+","+y);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p = new Point();
		p.print();
		
	}

}

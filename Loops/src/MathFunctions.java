import java.lang.Math.*;
public class MathFunctions {

	public static void main(String[] args) {
		double x=8;
		double y;
		System.out.println("Given Number:"+x);
		y=Math.sqrt(x);
		System.out.println("Square root:"+y);
		y=Math.pow(x, 3);
		System.out.println("Power:"+y);
		y=Math.sin(x);
		System.out.println("sine:"+y);
		y=Math.cos(x);
		System.out.println("Cosine:"+y);
		y=Math.log(x);
		System.out.println("Logarithm:"+y);
		y=Math.abs(x);
		System.out.println("Absolute Number:"+y);
		
	}

}

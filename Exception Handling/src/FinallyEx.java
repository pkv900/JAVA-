
public class FinallyEx {

	public static void main(String[] args) {
		
		try {
			int num=121/0;
			System.out.println(num);
		}
		catch(ArithmeticException e) {
			
			System.out.println("Number should not be divided by 0");
		}

		finally {
			System.out.println("This is finally block");
			 int num=100+53;
			 System.out.println(num);
		}
		
		System.out.println("Out of try-catch block");
	}

}

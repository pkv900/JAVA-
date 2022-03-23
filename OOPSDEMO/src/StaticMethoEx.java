
public class StaticMethoEx {
			static int i =10;
			static String s ="PKV";

			//Static method
			static void display() {
				System.out.println(i);
				System.out.println(s);
			}
			
			//Non Static Method
			void func() {
				//Static method called inside non static method
				display();
			}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.out.println(i);
		//System.out.println(s);
		
		StaticMethoEx sme = new StaticMethoEx();
		
		sme.func();
		
		

	}

}

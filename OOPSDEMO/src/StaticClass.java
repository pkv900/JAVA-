
public class StaticClass {

	private static String str="PKV";
	
	//Static class
	static class Myclass{
		//Non Static method
		public void disp() {
			System.out.println(str);
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StaticClass.Myclass mc = new StaticClass.Myclass();
		
		mc.disp();
		
	}

}

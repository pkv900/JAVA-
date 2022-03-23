
public class StaticBlockEx {

		static int num,num2;
		static String mystr,mystr2;
		
		static {
			System.out.println("First Static Block");
			num=007;
			mystr="I am a static variable initialised inside a static block";
		}
		
		static {
			System.out.println("Second Static Block");
			num=006;
			mystr="I am static variable initialised inside second static block";
			
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Value of static varialbe num is:"+num);
		System.out.println(mystr);
		System.out.println("Value of static varialbe num2 is:"+num);
		System.out.println(mystr);
	}

}

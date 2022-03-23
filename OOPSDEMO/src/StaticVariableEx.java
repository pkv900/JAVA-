
public class StaticVariableEx {
			/*
			static int v1;
			static String v2="I am a static variable";
			
			static void disp() {
				System.out.println("var 1 ="+v1);
				System.out.println("var 2 ="+v2);
			}
			*/
	
			//Static integer variable
			static int var1=77;
			String var2;
			
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//disp();
		
		StaticVariableEx obj1 = new StaticVariableEx();
		StaticVariableEx obj2 = new StaticVariableEx();

		/*Static variables can be accessed directly without any instances.
		 * Just to demonstrate the static variables are shared,made changes.
		 * I am accessing them using objects so that we can check that changes made
		 * to static variables by one object,reflects when we accesss them using
		 * other objects.
		 */
		
		//Assigning the value to static variable using object1
		obj1.var1=99;
		obj1.var2="I am object 1";
		
		/*This will overwrite th value of var1 because var1 has single
		 * copy shared among both objects.
		 */
		obj1.var1=88;
		obj1.var2="I am object 2";
		
		System.out.println("Object 1 integer"+obj1.var1);
		System.out.println("Object 1 String"+obj1.var2);
		System.out.println("Object 2 integer"+obj2.var1);
		System.out.println("Object 2 String"+obj2.var2);
				
				
				
				
				
	}

}

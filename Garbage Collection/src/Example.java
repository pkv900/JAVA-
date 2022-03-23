import java.lang.package;

public class Example {

	public static void main(String[] args) {
		
		//Unreachable
		Example obj =new Example();
		obj = null;

		//Unusable
		Example a = new Example();
		Example b = new Example();
		b=a;
		
		System.gc();
		
	}
		protected void finalize() throws throwable{
			
			System.out.println("Garbage Collection is performed by the JVM");
		}
	}

}

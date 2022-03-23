
public class demothread {

	public static void main(String[] args) {
		Thread obj=Thread.currentThread();
		System.out.println("Current="+obj);
		obj.setName("INDIA");
		obj.setPriority(7);
		System.out.println("After="+obj);

	}

}

class threadname implements Runnable
{
	int x;
	String name;
	public threadname(String n)
	{
		name=n;
		
	}
	public void run()
	{
		for(x=0;x<10;x++)
		{
			System.out.println(name);
		}
	}
}
public class mainclass {

	public static void main(String[] args) {
		threadname tc1 = new threadname("Welcome");
		threadname tc2 = new threadname("Wel");
		Thread t1 = new Thread(tc1);
		Thread t2 = new Thread(tc2);
		
		t1.start();
		t2.start();

	}

}

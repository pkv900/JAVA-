class ThreadDemo extends Thread
{
	int i=0;
	public void run()
	{
		for(i=0;i<10;i++)
		{
			try {
				sleep(5000);
				}
			catch(Exception e)
			{
				
			}
			System.out.println("Separate Thread:"+i);
		}
	}
}
public class ThreadTest {

	public static void main(String[] args) {
		ThreadDemo td= new ThreadDemo();
		td.start();
		for(int j=0;j<10;j++)
		{
			try {
				td.sleep(5000);
				
			}
			catch(Exception e)
			{
			
			}
			
			System.out.println("Main Thread"+j);
		}

	}

}

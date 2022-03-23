
public class firstthread extends Thread{

	public void run() {
		System.out.println("Thread is running....");
	}
	public void start()
	{
		run();
	}
	public static void main(String[] args) {
	firstthread t= new firstthread();
	t.start();

	}

}

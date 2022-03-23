class throwsdemo
{
	public throwsdemo() throws NullPointerException
	{
		System.out.println("Caught");
		throw new NullPointerException("demo");
	}
}
public class tdemo {

	public static void main(String[] args) {
			try
			{
				throwsdemo td = new throwsdemo();
				
			}
			catch(NullPointerException e)
			{
				System.out.println("ReCaught");
			}

	}

}

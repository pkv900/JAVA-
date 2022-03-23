
class Counter
{
	int i=0;
	Counter increment()
	{
		i++;
		return this;
	}
	void print()
	{
		System.out.println("i="+i);
	}
}
public class CounterDemo extends Counter {

	public static void main(String[] args) {
	
		Counter x=new Counter();
		x.increment().increment().increment().print();
	}

}

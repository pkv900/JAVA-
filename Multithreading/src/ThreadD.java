//import java.io.*;
//import java.util.*;

class AA extends Thread
{
	int i;
	public void run()
	{
		System.out.println("Thread A");
		for(i=0;i<5;i++)
		{
			System.out.println("Thread A:"+i); 
			yield();
		}
	}
}

class BB extends Thread
{
	int i;
	public void run()
	{
		System.out.println("Thread B");
		for(i=0;i<5;i++)
		{
			System.out.println("Thread B:"+i);
			yield();
		}
	}
}

class C extends Thread
{
	int i;
	public void run()
	{
		System.out.println("Thread C");
		for(i=0;i<5;i++)
		{
			System.out.println("Thread C:"+i);
			yield();
			
		}
	}
}

class ThreadD {

	public static void main(String[] args) {
		AA a = new AA();
		BB b = new BB();
		C c = new C();
		a.start();
		b.start();
		c.start();
	}

}

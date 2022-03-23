class A
{
	int a=10;
	public void show()
	{
		System.out.println("Class A is good");
	}
	
}

class B extends A
{
	public void show()
	{	
		super.show();
		System.out.println("Class B is good"+super.a);
	}
}

class C extends A
{
	public void show()
	{	
		super.show();
		System.out.println("Class C is good");
	}
}
public class Hierarchy {

	public static void main(String[] args) {
		
		A a=new A();
		a.show();
		B b=new B();
		b.show();
		C c=new C();
		c.show();
		
	}

}

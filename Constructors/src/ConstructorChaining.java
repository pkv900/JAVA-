
public class ConstructorChaining {
	
	public String name;
	public int salary;
	public String address;
	
	//Default constructor
	public ConstructorChaining() {
		//This will call the constructor with string parameter
		this("NAme");
	}
   
	public ConstructorChaining(String name) {
		this(name,120035);
	}
	
	
	public ConstructorChaining(String name,int sal) {
		this(name,sal,"Delhi");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

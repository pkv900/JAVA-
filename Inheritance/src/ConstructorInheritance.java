
class parent{
	public parent() {
		System.out.println("Constructor of parent");
	}
	
	void display() {
		System.out.println("Parent Method");
	}
}
public class ConstructorInheritance extends parent {

	public ConstructorInheritance() {
		System.out.println("Constructor of Child");
	}
	void display() {
		System.out.println("Child Method");
		
		super.display();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//object of child class
		ConstructorInheritance je = new ConstructorInheritance();
		je.display();
	}

}

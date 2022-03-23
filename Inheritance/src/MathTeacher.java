
public class MathTeacher extends Teacher {

	String mainSubject ="Mathematics";
	
	void salary() {
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MathTeacher mt = new MathTeacher();
		System.out.println(mt.college);
		System.out.println(mt.designation);
		System.out.println(mt.mainSubject);
		mt.does();
		mt.salary();

	}

}

import java.util.Scanner;

public class StudentDetails {
	private int i,id,avg,total;
	private int a[]=new int[10];
	public 	String name=new String();
	public Scanner sc = new Scanner(System.in);
	public void read()
	{
		for(i=0;i<5;i++)
		{
		System.out.println("Enter Student Name:");
		name=sc.nextLine();
		System.out.println("Enter Student ID:");
		id=sc.nextInt();
		System.out.println("Enter 6 Subject Marks:");
			for(i=0;i<6;i++)
			a[i]=sc.nextInt();
		}	
	}
	
	public void calculate()
	{
		for(i=0;i<5;i++)
		{
		 for(int j=0;j<6;j++)
		 {
		 total+=a[i];
		 avg=(total/6);
		 }
		}
		
	}

	public void display()
	{
		
		System.out.println("\nStudent Details\n");
		System.out.println("Name:"+name);
		System.out.println("Student Id:"+id);
		System.out.println("total:"+total);
		System.out.println("Average:"+avg);
		
		
	}
	
	public static void main(String[] args) {
		
		StudentDetails sd1 = new StudentDetails();
		StudentDetails sd2 = new StudentDetails();
		StudentDetails sd3 = new StudentDetails();
		StudentDetails sd4 = new StudentDetails();
		StudentDetails sd5 = new StudentDetails();
		
		sd1.read();
		sd2.read();
		sd3.read();
		sd4.read();
		sd5.read();
		
		sd1.calculate();
		sd2.calculate();
		sd3.calculate();
		sd4.calculate();
		sd5.calculate();
		
		sd1.display();
		sd2.display();
		sd3.display();
		sd4.display();
		sd5.display();
		
		
		
	}

}

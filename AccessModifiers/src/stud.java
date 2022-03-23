import java.util.*;
class student
{
	private int i,n,avg,total;
	private int a[]=new int[10];
	public String st = new String[];
	public Scanner sc=new Scanner(System.in);
	void read()
	{
		System.out.println("Enter Student Name:");
		st=sc.nextLine();
		System.out.println("Enter Student ID:");
		n=sc.nextInt();
		System.out.println("Enter 6 Subject Marks:");
		for(i=0;i<5;i++)
			a[i]=sc.nextInt();
	}
	
	void calculate()
	{
		for(i=0;i<5;i++)
			total+=a[i];
		avg=(total/5);
	}
	
	void display()
	{
		System.out.println("name:"+St);
		System.out.println("Student ID:"+n);
		System.out.println("Total:"+total);
		System.out.println("Average:"+avg);
	}
}
public class stud {

	public static void main(String[] args) {
		student s=new student();
		s.read();
		s.calculate();
		s.display();
	}

}

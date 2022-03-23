import java.util.Scanner;

public class DateAge {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age;
		System.out.println("Enter Age:");
		age= sc.nextInt();
		
		assert age>=18:"Date";
		System.out.println("You can Date");
		

	}

}

import java.util.Scanner;

class Student{
	
	String name,course;
	int age;
	Scanner scan = new Scanner(System.in);
	void getDetails() {
		System.out.print("Enter Student name : ");
		name = scan.nextLine();
		
		System.out.print("\nEnter student age : ");
		age = scan.nextInt();
		
		System.out.println("\nEnter course : ");
		course = scan.next();
	}
}

public class StudentDetail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		s1.getDetails();
		
		System.out.println("Student Info \n Name : "+s1.name+"\n Age : "+s1.age+"\n Course : "+s1.course);

	}

}

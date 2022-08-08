import java.util.Scanner;
public class Area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c;
		Scanner scan = new Scanner(System.in);
		System.out.println("hello world.")
		System.out.println("1.Area of Square");
		System.out.println("2.Area of Rectangle");
		System.out.println("3.Area of Circle");
		System.out.println("4.Area of Triangle");
		System.out.println("Enter your choice : ");
		c = scan.nextInt();
		
		switch(c) {
		case 1 : 
			System.out.println("Enter length of square : ");
			int l = scan.nextInt();
			System.out.println("Area of square is : "+(l*l));
			break;
		case 2 :
			System.out.println("Enter length and width of rectangle : ");
			int len = scan.nextInt();
			int wid = scan.nextInt();
			System.out.println("Area of rectangle is : "+(len*wid));
			break;
		case 3 :
			System.out.println("Enter radius of circle : ");
			double r = scan.nextDouble();
			System.out.println("Radius of circle : "+(3.14 * r * r));
			break;
		case 4 :
			System.out.println("Enter base and height of traingle : ");
			double base = scan.nextDouble();
			double h = scan.nextDouble();
			System.out.println("Area of triangle : "+(0.5 * base * h));
			break;
		}

	}

}

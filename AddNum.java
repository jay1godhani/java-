import java.util.Scanner;
public class AddNum {

	public static int add(int a,int b) {
		return a+b;
		}

		public static double add(double a,double b) {
		return a+b;
		}

	 
	public static void main(String[] args) {
	int x,y;
	double a,b;
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter two Integers : ");
	x=sc.nextInt();
	y=sc.nextInt();
	System.out.println("call add with two integer parameter : "+add(x,y));
	System.out.print("\n\nEnter two Doubles : ");
	a=sc.nextDouble();
	b=sc.nextDouble();
	System.out.println("call add with two double parameter : "+add(a,b));
	sc.close();
	
	 
	

	}

}

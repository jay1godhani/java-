import java.util.Scanner;
public class OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Number : ");
		n = scan.nextInt();
		
		if(n%2 == 0) {
			System.out.println(n+" is even number");
		}
		else {
			System.out.println(n+" is odd number");
		}

	}

}

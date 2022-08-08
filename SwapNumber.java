import java.util.Scanner;
public class SwapNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1,n2;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter number n1 and n2 : ");
		n1 = scan.nextInt();
		n2 = scan.nextInt();
		
		n1 = n1 + n2;
		n2 = n1 - n2;
		n1 = n1 - n2;
		
		System.out.println("Numbers After Swap");
		System.out.println("n1 : "+n1+" , n2 : "+n2);

	}

}

import java.util.Scanner;
public class GroupString {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter String: ");
		String s = scan.nextLine();

		s = s.toUpperCase();

		int count = -1;
		System.out.print("String : ");
		for(int i = 0; i < s.length(); i++)
		{
		if(count != 4) {
		System.out.print(s.charAt(i));	
		count++;
		}
		else {
		System.out.print(" "+s.charAt(i));
		count = 0;
		}

		}

	}

}

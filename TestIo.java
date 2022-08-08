import java.util.Scanner;
public class TestIo {

	public static void main(String[] args) {
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("enter user name");
			String name=sc.nextLine();
			System.out.println("enter age:");
			int age=sc.nextInt();
			System.out.println("enter percentage:");
			double per=sc.nextDouble();
			System.out.println("enter gender:");
			char gen=sc.next().charAt(0);
			System.out.println("enter mobile no.:");
			long mob=sc.nextLong();
			System.out.println(name+"\n"+age+"\n"+per+"\n"+gen+"\n"+mob);
			
		}

	}

}

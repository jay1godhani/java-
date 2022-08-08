import java.util.Scanner;

class BrideException extends Exception {
	 public BrideException(String s)
	 {
	     // Call constructor of parent Exception
	     super(s);
	 }
}

class GroomException extends Exception {
	public GroomException(String s) {
		// Call constructor of parent Exception
		super(s);
	}
}


public class GroomBride {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner scan = new Scanner(System.in);
		 
		 System.out.print("Enter age of Bride = ");
		 int bride = scan.nextInt();
		 
		 System.out.print("Enter age of Groom = ");
		 int groom = scan.nextInt();
	
		 try {
			 if(bride < 21)
				 throw new BrideException("\n Bride doesn't qualify for the marriage...");
			 else if(groom < 21)
				 throw new GroomException("\n Bride doesn't qualify for the marriage...");
			 System.out.println("\n Both are qualify for the marriage...");
	     }
	     catch (BrideException ex) {
	         System.out.println(ex.getMessage());
	     }
		 catch (GroomException ex) {
	         System.out.println(ex.getMessage());
	     }

	}

}

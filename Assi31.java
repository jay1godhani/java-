import java.util.Scanner;
class Square{
     int length ;
     Square(int l){length=l;}

    void printLength()
    {
        System.out.println("Length of Square is : "+length);
    }
}
  class RoundSquare extends Square{
  int borderRadius;
  RoundSquare(int l,int r){
  super(l);
  borderRadius=r;
}

void printRadius()
{
System.out.println("Border-Radius of RoundSquare is : "+borderRadius);
}
}
class Rhombus extends RoundSquare{
int diagonalLength ;
Rhombus(int l,int r,int d){
super(l,r);
diagonalLength=d;
}
void printDiagonal() {
System.out.println("Diagonal length of Rhombus : "+diagonalLength);
}
}

public class Assi31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int l,ra,d;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter length for Square : " );
		l=sc.nextInt();
		System.out.print("Enter borderRadius for RoundSquare: " );
		ra=sc.nextInt();
		System.out.print("Enter diagonalLength  for Rhombus : " );
		d=sc.nextInt();
		System.out.println("\n");
		Rhombus r = new Rhombus(l,ra,d);
		r.printDiagonal();
		r.printRadius();
		r.printLength();
		sc.close();

	}

}

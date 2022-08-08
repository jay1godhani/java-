class Furniture{
void use() {
System.out.println("class Ferniture");
}
}
 
class Chair  extends  Furniture{
void use() {
System.out.println("Chair use to accommodate one sitting or reclining person");
}
}
 
 
class Bed  extends  Furniture{
void use() {
System.out.println("Bed use to as a place to sleep, rest, and relax.");
}
}
 
class Table extends  Furniture{
void use() {
System.out.println("Table use to put things on it.");
}
}

public class Assi32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Furniture f;
		f=new Chair();
		System.out.print("For Chair : ");
		f.use();
		f=new Bed();
		System.out.print("For Bed : ");
		f.use();
		f=new Table();
		System.out.print("For Table : ");
		f.use();
		 
		
		
		
		 
		

	}

}

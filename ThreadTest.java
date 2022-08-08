import java.util.Scanner;

class A extends Thread
{

	public void run()
	{
	for(int i=0;i<=5;i++)
    	System.out.println("i=" +i);
      System.out.println("Exit thread A");
    }
}
class B extends Thread
{

	public void run()
	{
	for(int j=0;j<=5;j++)
		System.out.println("j=" +j);
        System.out.println("Exit thread B");
}
}

class C extends Thread

{
	public void run()
	{
	for(int k=0;k<=5;k++)
		System.out.println("k=" +k);

       System.out.println("Exit thread C");
}
}
class ThreadTest {

	public static void main(String[] args) {
		
         new A().run();
         new B().run();
         new C().run();
	}

}

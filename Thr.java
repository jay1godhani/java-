
public class Thr implements Runnable{
	public void run(){  
		System.out.println("simple thread by implementing Runnable interface is running.....");  
		}


	public static void main(String[] args)
	{
	Thr t1=new Thr();
	Thread t2 =new Thread(t1);
	t2.start();
	}
}
	


	



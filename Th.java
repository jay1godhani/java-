
public class Th extends Thread
{
	
	public void run()
	    {  
		System.out.println("simple thread by extending Thread class is running.....");  
		}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
        Th t1=new Th();
        t1.start();
	}

}




  




public class AliveJoin extends Thread  {
	public void run() {
		try {
		for(int i=1;i<=5;i++) {
		System.out.println("i = "+i);
		Thread.sleep(300);
		}
		System.out.println("Exit Thread");
		}
		catch(InterruptedException ie){}
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AliveJoin t1=new AliveJoin();
		AliveJoin t2=new AliveJoin();
		t1.start();

		         try{
		        if(t1.isAlive()) {System.out.println("t1 is alive");}
		             else {System.out.println("t1 is not alive");}
		                 t1.join();  
		                 if(t2.isAlive()) {System.out.println("t2 is alive");}
		                 else {System.out.println("t2 is not alive");}
		         }catch(InterruptedException ie){
		          System.out.println(ie);
		         }
		         t2.start();

	}

}

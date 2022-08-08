
public class Alive extends Thread {
	public void run(){
        System.out.println(this.getName()+" Start");
        try {
            Thread.sleep(500);
        }
        catch (InterruptedException ie) {
        }
        System.out.println(this.getName()+" end ");
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Alive a1=new Alive();
		Alive a2=new Alive();
		Alive a3=new Alive();
		a1.start();
		a2.start();
		a3.start();
		if(a1.isAlive()) {
		System.out.println(a1.getName()+" is alive");
		}
		else {
		System.out.println(a1.getName()+" is not alive");
		}
		if(a2.isAlive()) {
		System.out.println(a2.getName()+" is alive");
		}
		else {
		System.out.println(a2.getName()+" is not alive");
		}
		if(a3.isAlive()) {
		System.out.println(a3.getName()+" is alive");
		}
		else {
		System.out.println(a3.getName()+" is not alive");
		}

	}

}

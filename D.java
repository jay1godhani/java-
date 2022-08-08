class A extends Thread{
public void run() {
try {
for(int i=1;i<=5;i++) {
System.out.println("i = "+i);
Thread.sleep(200);
}
System.out.println("Exit Thread A");
}
catch(InterruptedException ie){}
}
}

class B extends Thread{
public void run() {
try {
for(int j=1;j<=5;j++) {
System.out.println("j = "+j);
Thread.sleep(200);
}
System.out.println("Exit Thread B");
}
catch(InterruptedException ie){}
}
}

class C extends Thread{
public void run() {
try {
for(int k=1;k<=5;k++) {
System.out.println("k = "+k);
Thread.sleep(200);
}
System.out.println("Exit Thread C");
}
catch(InterruptedException ie){}
}
}

public class D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new A().start();
		new B().start();
		new C().start();

	}

}

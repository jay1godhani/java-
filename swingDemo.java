import javax.swing.*;

 class swingDemo
 {
	 swingDemo()
	 {
		 JFrame jfrm=new JFrame("Swing application");
		 jfrm.setSize(275,100);
		 jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 JLabel jlab=new JLabel("Swing GUI");
		 jfrm.add(jlab);
		 jfrm.setVisible(true);
		 JButton btn=new JButton("Submit");
		 jfrm.add(btn);
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          new swingDemo();
          
	}

}

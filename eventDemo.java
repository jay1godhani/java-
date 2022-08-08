
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class eventDemo implements ActionListener {

    eventDemo(){
        JFrame f = new JFrame("Event Example");
        f.setSize(300,300);
        JLabel lbl = new JLabel("Press Button");
        lbl.setBounds(50,50,150,30);
        JButton btn1 = new JButton("First");
       btn1.setBounds(60,150,70,40);
       JButton btn2 = new JButton("Second");
       btn2.setBounds(170,150,100,40);
        btn1.setFocusable(false);
        btn2.setFocusable(false);
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lbl.setText("First Button Pressed!!!");
            }
        });
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lbl.setText("Second Button Pressed!!!");
            }
        });
        f.add(btn1);
        f.add(btn2);
        f.add(lbl);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new eventDemo();
    }


    public void actionPerformed(ActionEvent e) {}
}


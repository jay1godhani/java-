package calculater;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class SimpleCalculator extends JFrame implements Runnable, ActionListener {
	Thread th;
	JTextField jtf, answer;
	Font f;
	double ans = 0;
	
	InfixToPostfix itp;
	PostfixCalculator pc;

	SimpleCalculator(String s) {
		super(s);
		setLayout(null);
		setBackground(Color.green);

		th = new Thread(this);

		f = new Font("Arial", Font.BOLD, 19);

		jtf = new JTextField();
		jtf.setBounds(100, 10, 400, 70);
		jtf.setFont(f);
		add(jtf);
		
		answer = new JTextField();
		answer.setBounds(500, 10, 100, 70);
		answer.setText("" + ans);
		answer.setFont(f);
		add(answer);

		f = new Font("Arial", Font.PLAIN, 15);

		String buttons[] = { "Start", "=/Enter", "stop", "+", "-", "*", "/", "%", "x2", "x3", "(", ")", "√x", "log", "*10", "1/x", ".", "DEL", "6", "7", "8", "9", "0", "5", "4", "3", "2", "1" };
		int c1[] = { 100, 300, 500, 100, 200, 300, 400, 500, 100, 200, 300, 400, 500, 100, 200, 300, 400, 500, 100, 200, 300, 400, 500, 100, 200, 300, 400, 500 };
		int r1[] = { 90, 90, 90, 150, 150, 150, 150, 150, 200, 200, 200, 200, 200, 250, 250, 250, 250, 250, 300, 300, 300, 300, 300, 350, 350, 350, 350, 350 };

		for (int i = 0; i < buttons.length; i++) {
			JButton button = new JButton(buttons[i]);
			button.setBounds(c1[i], r1[i], 100, 50);
			button.addActionListener(this);
			button.setFont(f);
			add(button);
		}

		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});

		th.start();
	}

	public void run() {

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String data = e.getActionCommand();
		
		if("0123456789().+-*/".indexOf(data) != -1) {
			jtf.setText(jtf.getText() + data);
		}
		else {	
			boolean set = false;
			String s = jtf.getText();

			switch (data) {
				case "%":
					ans = ans * 100 * Integer.parseInt(s);
					break;	
				case "x2":
					jtf.setText(s + "^2");
					set = true;
					break;	
				case "x3":
					jtf.setText(s + "^3");
					set = true;
					break;	
				case "*10":
					ans *= 10;
					break;	
				case "1/x":
					if(s.isEmpty())
						jtf.setText("(1/0)");
					else 
						jtf.setText(s.substring(0, s.length()-1) + "(1/" + s.substring(s.length()-1, s.length()) + ")");
					set = true;
					break;	
				case "=/Enter":
					String postfix = itp.infixToPostfix(s);
					ans = Math.round(pc.evaluatePostfix(postfix) * 100) / (double)100;
					jtf.setText(postfix);
					break;	
				case "DEL":
					jtf.setText(s.substring(0, s.length()-1));
					set = true;
					break;	
			}
			answer.setText("" + ans);
			if(!set)
				jtf.setText("");
			jtf.requestFocus();
		}
		
	}
}

public class Calculator {
	public static void main(String[] jay) {
		SimpleCalculator gr = new SimpleCalculator("Calculator");
		gr.setVisible(true);
		gr.setLocation(800, 100);
		gr.setSize(700, 500);
	}
}

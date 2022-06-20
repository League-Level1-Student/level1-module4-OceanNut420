package _08_calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Calculator implements Runnable, ActionListener {
	int e = 0;
	int ad = 2;
	int mul = 5;
	public static void main(String[] args) {
		

	}
	public void add() {
		e = e + ad;
		System.out.println(e);
	}
	public void sub() {
		e = e - ad;
		System.out.println(e);
	}
	public void multiply() {
		e = e * mul;
		System.out.println(e);
	}
	public void divide() {
		e = e / mul;
		System.out.println(e);
	}
	@Override
	public void run() {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		JPanel panel = new JPanel();
		JLabel label = new JLabel();
		
		String ee = "" + e;
		label.setText(ee);
		
		JButton add = new JButton();
		JButton sub = new JButton();
		JButton mul = new JButton();
		JButton div = new JButton();
		add.setText("add");
		sub.setText("sub");
		mul.setText("mul");
		div.setText("div");
		
		panel.add(add);
		panel.add(sub);
		panel.add(mul);
		panel.add(div);
		panel.add(label);
		frame.add(panel);
		frame.pack();
		
		add.addActionListener(this);
		sub.addActionListener(this);
		mul.addActionListener(this);
		div.addActionListener(this);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("aaa");
	}

}

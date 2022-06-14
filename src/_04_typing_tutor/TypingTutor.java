package _04_typing_tutor;

import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.Color;

public class TypingTutor implements KeyListener{

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	char currentLetter;
	
	char generateRandomLetter() {
	    Random r = new Random();
	    return (char) (r.nextInt(26) + 'a');
	}

	void setup(){
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		
		currentLetter = generateRandomLetter();
		String curr = "" + currentLetter;
		
		label.setText(curr);
		label.setFont(label.getFont().deriveFont(28.0f));
		label.setHorizontalAlignment(JLabel.CENTER);
		
		panel.add(label);
		frame.pack();
		frame.addKeyListener(this);
		
	}
	
	
	@Override
	public void keyTyped(KeyEvent e) {
		
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		String curr = "" + currentLetter;
		char user = e.getKeyChar();
		String user2 = "" + user;
		
		System.out.println("key pressed: " + user);
		if(curr.equals(user2)) {
			System.out.println("correct");
			panel.setBackground(Color.GREEN);
		}
		else {
			panel.setBackground(Color.RED);
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		currentLetter = generateRandomLetter();
		String curr = "" + currentLetter;
		label.setText(curr);
		
	}
	
}

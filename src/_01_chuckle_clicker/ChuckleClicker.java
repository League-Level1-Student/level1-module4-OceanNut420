package _01_chuckle_clicker;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker {

	public static void main(String[] args) {
		
		makeButtons();
		
	}

	private static void makeButtons() {
		JOptionPane.showMessageDialog(null, "Make Buttons");
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JButton jokeButton = new JButton();
		JButton punchButton = new JButton();
		
		frame.setVisible(true);
		frame.add(panel);
		panel.add(jokeButton);
		panel.add(punchButton);
		jokeButton.setText("joke");
		punchButton.setText("punchline");
		jokeButton.addActionListener(null);
		
		if(1==1) {
			
		}
		
	}

}

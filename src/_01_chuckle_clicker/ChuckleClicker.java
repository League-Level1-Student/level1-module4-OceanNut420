package _01_chuckle_clicker;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker implements ActionListener {

	public static void main(String[] args) {
		
		//makeButtons();
		
	}

	JButton jokeButton = new JButton();
	JButton punchButton = new JButton();
	
	public void makeButtons() {
		JOptionPane.showMessageDialog(null, "Make Buttons");
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		
		panel.add(jokeButton);
		panel.add(punchButton);
		
		jokeButton.setText("joke");
		punchButton.setText("punchline");
		jokeButton.addActionListener(this);
		punchButton.addActionListener(this);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonClick = (JButton) e.getSource();
		
		if() {
			JOptionPane.showMessageDialog(null, "hi");
		}
	}
	

}

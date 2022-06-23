package _12_slot_machine;

import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class slotMachine {

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton();
	JLabel frog = loadImageFromComputer("frog.png");
	JLabel boy = loadImageFromComputer("beef boy.jpg");
	JLabel lime = loadImageFromComputer("lyme.jpeg");
	
	void run(){
		
		frog.setBounds(0, 0, 50, 50);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		panel.add(button);
		panel.add(frog);
		panel.add(boy);
		panel.add(lime);
		frame.setVisible(true);
		frame.pack();
		
	}
	
	public JLabel loadImageFromComputer(String fileName) {
		URL imageURL = getClass().getResource(fileName);
		Icon icon = new ImageIcon(imageURL);
		return new JLabel(icon);
	}
	
	
}

package _12_slot_machine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class slotMachine implements ActionListener {

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton();
	JLabel label = new JLabel();
	Random rand = new Random();
	int width = 20;
	int win = 0;
	
	void run(){
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		frame.setVisible(true);
		button.setText("SPIN");
		button.addActionListener(this);
		
		addImg();
		
	}
	
	void addImg() {
		
		int same = 0;
		int on = 0;
		int tw = 0;
		int th = 0;
		
		for(int i = 0; i < 3; i++) {
			JLabel frog = loadImageFromComputer("frog.png");
			JLabel boy = loadImageFromComputer("beef boy.jpg");
			JLabel lime = loadImageFromComputer("lyme.jpeg");
			
			int no = rand.nextInt(3);
			same = same + no;
			
			if(no == 0) {
				panel.add(frog);
				width = width + 139;
			}
			if(no == 1) {
				panel.add(boy);
				width = width + 361;
			}
			if(no == 2) {
				panel.add(lime);
				width = width + 225;
			}
			
			if(i == 0) {
				on = no;
			}
			if(i == 1) {
				tw = no;
			}
			if(i == 2) {
				th = no;
			}
			
		}
		
		if(on == tw && tw == th) {
			
			JOptionPane.showMessageDialog(null, "win");
			win = win + 1;
			String win2 = "" + win;
			label.setText("wins: " + win2);
			
		}
		
		frame.setSize(width,500);
		panel.add(button);
		panel.add(label);
		
	}
	
	public JLabel loadImageFromComputer(String fileName) {
		URL imageURL = getClass().getResource(fileName);
		Icon icon = new ImageIcon(imageURL);
		return new JLabel(icon);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		width = 20;
		panel.removeAll();
		addImg();
		
	}
	
	//0000000000000000000000000000
	
	private JLabel createLabelImage(String fileName) throws MalformedURLException{
        URL imageURL = getClass().getResource(fileName);
	if (imageURL == null){
		System.err.println("Could not find image " + fileName);
		return new JLabel();
	}
	Icon icon = new ImageIcon(imageURL);
	JLabel imageLabel = new JLabel(icon);
	return imageLabel;
	}
	
}

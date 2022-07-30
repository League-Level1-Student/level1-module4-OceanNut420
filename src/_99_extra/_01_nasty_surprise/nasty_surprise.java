package _99_extra._01_nasty_surprise;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class nasty_surprise implements ActionListener {

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton();
	JButton button2 = new JButton();
	
	public static void main(String[] args) {
		
	}
	
	public nasty_surprise() {
		
	frame.add(panel);
	panel.add(button);
	panel.add(button2);
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setSize(200,70);
	button.setText("trick");
	button2.setText("treat");
	
	button.addActionListener(this);
	button2.addActionListener(this);
	
	}

	private void showPictureFromTheInternet(String imageUrl) {
	    try {
	        URL url = new URL(imageUrl);
	        Icon icon = new ImageIcon(url);
	        JLabel imageLabel = new JLabel(icon);
	        JFrame frame = new JFrame();
	        frame.add(imageLabel);
	        frame.setVisible(true);
	        frame.pack();
	    } catch (MalformedURLException e) {
	        e.printStackTrace();
	    }
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		JButton augh = (JButton) e.getSource();
		
		if(augh == button) {
			showPictureFromTheInternet("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTGJr_9cZ9DJ57LAZ-jgcsNDhcxNlCDJP9-Pw&usqp=CAU");
		}
		if(augh == button2) {
			showPictureFromTheInternet("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQhuG0UE_CJz4U8ewOyWrWt2GewGN17FJNCMA&usqp=CAU");
		}
		
	}
	
}

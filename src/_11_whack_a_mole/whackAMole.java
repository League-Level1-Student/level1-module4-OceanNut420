package _11_whack_a_mole;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class whackAMole implements ActionListener {
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	Random rand = new Random(23);
	int m = rand.nextInt(23);
	String aug = "";
	JButton naw = new JButton();
	
	void run(){
		
		frame.add(panel);
		frame.setVisible(true);
		frame.setSize(265,315);
		
		drawButtons(rand);
		
	}
	
	void drawButtons(Random rand){
		
		for(int i=0;i<24;i++) {
			
			JButton button = new JButton();
			button.addActionListener(this);
			
			if(i == m) {
				button.setText("mole");
				naw = button;
			}
			
			panel.add(button);
		}
		
	}	
	
	static void speak(String words) {
        if( System.getProperty( "os.name" ).contains( "Windows" ) ) {
            String cmd = "PowerShell -Command \"Add-Type -AssemblyName System.Speech; (New-Object System.Speech.Synthesis.SpeechSynthesizer).Speak('"
                    + words + "');\"";
            try {
                Runtime.getRuntime().exec( cmd ).waitFor();
            } catch( Exception e ) {
                e.printStackTrace();
            }
        } else {
            try {
                Runtime.getRuntime().exec( "say " + words ).waitFor();
            } catch( Exception e ) {
                e.printStackTrace();
            }
        }
    }

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonClick = (JButton) e.getSource();
		if(buttonClick == naw) {
			
		}
		else{
			speak("rong");
			System.out.println("rong");
		}
		
	}
	
}

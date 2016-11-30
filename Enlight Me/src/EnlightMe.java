import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class EnlightMe {

	public static void main(String[] args)
	{
		
		JFrame frame = new JFrame("Instgram Quote Generator | ConceptCodes");
		  frame.setVisible(true);
		  frame.setSize(500,200);
		  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		  frame.add(panel);
		  JButton button = new JButton("Generator");
		  panel.add(button);
		  button.addActionListener (new Action1());		  
		 
		  JLabel Textbox = new JLabel(); Textbox.setText("Press Button for enlightment");
	}
	
	static class Action1 implements ActionListener {        
		  public void actionPerformed (ActionEvent e) {     
			  try {
				Desktop.getDesktop().open(new java.io.File("C:\\Users\\David Ojo\\Desktop\\Fork.bat"));
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		    
		  }
		}
	
}
	



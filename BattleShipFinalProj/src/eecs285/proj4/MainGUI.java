package eecs285.proj4;

import javax.swing.*;

import eecs285.proj4.allShips.*;

import java.awt.*;

public class MainGUI extends JFrame {
	
	
	
	public MainGUI(String title)
	{
		super(title);
		JLabel back = new JLabel(new ImageIcon("/Users/brandonthomasdeere/Downloads/massiveShip.jpg"));
		back.setLayout(new FlowLayout());
	    setLayout(new BoxLayout(getContentPane(), BoxLayout.PAGE_AXIS));
	    JLabel shiplabel = new JLabel("Ships available");
	    
		
	}


}

package eecs285.proj4;
import javax.swing.*;

import eecs285.proj4.allShips.*;

import java.awt.*;
import java.awt.event.*;
public class SetupShips extends JFrame {
	
	
	private DefaultListModel<String> ships;
	private JList<String> list;
	private JScrollPane j;
	private JTextArea shiptextarea;
	private JButton[][] buttons = new JButton[10][10];
	
	public SetupShips(String title)
	{
		super(title);
		ships = Player.getShipsListModel();
		list = Player.getJListShips();
		//list.addListSelectionListener(null);
		JLabel back = new JLabel(new ImageIcon("/Users/brandonthomasdeere/Downloads/blueseadeep.jpg"));
		back.setLayout(new FlowLayout());
	    setLayout(new BoxLayout(getContentPane(), BoxLayout.PAGE_AXIS));
	    JLabel shiplabel = new JLabel("Ships available");
	    shiplabel.setFont(new Font("Serif", Font.BOLD, 36));
	    shiplabel.setForeground(Color.WHITE);
	    Box left = new Box(BoxLayout.Y_AXIS);
	    left.add(shiplabel);
	    shiptextarea = new JTextArea(40,10);
	    j = new JScrollPane(Player.getJListShips());
	    j.setPreferredSize(new Dimension(50,370));
	    shiptextarea.add(j);
	    left.add(j);
	    
	    Box right = new Box(BoxLayout.Y_AXIS);
	    Box right2 = new Box(BoxLayout.X_AXIS);
	    
	    Box p;
	    for (int i = 0; i < 10; ++i)
	    {
	      Box q = new Box(BoxLayout.X_AXIS);
	      for (int j = 0; j < 10; ++j)
	      {
	    	p = new Box(BoxLayout.Y_AXIS);
	    	buttons[i][j] = new JButton();
	    	q.add(buttons[i][j]);
	    	buttons[i][j].addActionListener(new Listener());
	    	right.add(q);
	      }
	      right2.add(right);
	    }
	    
	    left.setOpaque(false);
	    right2.setOpaque(false);
	    back.add(left);
	    back.add(right);
	    setContentPane(back);
	    
	    pack();
	    setVisible(true);
	    
	}
	
	public class Listener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
		  int counter = 0;
		  for (int i = 0; i < 10; ++i)
		  {
		    for (int j = 0; j < 10; ++j)
		    {
		    	if (e.getSource() == buttons[i][j])
		    	{
		    		buttons[i][j].setForeground(Color.GREEN);
		    		buttons[i][j].setBackground(Color.GREEN);
		    	}
		    	else
		    	{
		    		buttons[i][j].setForeground(Color.RED);
		    		buttons[i][j].setBackground(Color.RED);
		    	}
		    }
		  }

		}
	}
}

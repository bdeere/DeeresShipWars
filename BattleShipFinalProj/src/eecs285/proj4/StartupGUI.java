package eecs285.proj4;
import javax.imageio.ImageIO;
import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;



public class StartupGUI extends JFrame
{
  private JButton login;
  private JButton signup;
	
  public StartupGUI()
  {
	  super("Ship Wars");
	  
	  
	  JLabel back = new JLabel(new ImageIcon("/Users/brandonthomasdeere/Downloads/massiveShip.jpg"));
	  back.setLayout(new FlowLayout());
	  setLayout(new BoxLayout(getContentPane(), BoxLayout.PAGE_AXIS));
	  Box finalb = new Box(BoxLayout.Y_AXIS);
	  JLabel welcome = new JLabel("Welcome to Ship Wars!");
	  welcome.setFont(new Font("Serif", Font.PLAIN, 48));
	  welcome.setForeground(Color.ORANGE);
	  JPanel top = new JPanel();
	  top.setLayout(new FlowLayout());
	  top.add(welcome);
	  top.setOpaque(false);
	  JLabel shipWars = new JLabel("Ship Wars");
	  shipWars.setFont(new Font("Serif", Font.BOLD, 220));
	  shipWars.setForeground(Color.ORANGE);
	  JPanel title = new JPanel();
	  title.setLayout(new FlowLayout());
	  title.setBounds(20, 20, 80, 80);
	  title.add(new painting());
	  title.add(shipWars);
	  title.setOpaque(false);
	  JLabel subtitle = new JLabel("Battle Royale");
	  subtitle.setFont(new Font("Times New Roman", Font.BOLD, 88));
	  subtitle.setForeground(Color.ORANGE);
	  JPanel subt = new JPanel();
	  subt.setLayout(new FlowLayout());
	  subt.add(subtitle);
	  subt.setOpaque(false);
	  login = new JButton("Login");
	  login.setFont(new Font("Times New Roman", Font.ROMAN_BASELINE, 55));
	  login.setForeground(Color.BLUE);
	  signup = new JButton("Sign up");
	  signup.setFont(new Font("Times New Roman", Font.ROMAN_BASELINE, 55));
	  signup.setForeground(Color.BLUE);
	  signup.setBorderPainted(true);
	  login.setBorderPainted(true);
	  Box buttons = new Box(BoxLayout.X_AXIS);
	  buttons.add(login);
	  buttons.add(signup);
	  buttons.setOpaque(false);
	  JPanel bottom = new JPanel();
	  bottom.setLayout(new FlowLayout());
	  bottom.add(buttons);
	  bottom.setOpaque(false);
	  back.add(top);
	  back.add(title);
	  finalb.add(subt);
	  finalb.add(bottom);
	  back.add(finalb);
	  setContentPane(back);
	  
	  login.addActionListener(new LoginListener());
	  signup.addActionListener(new SignupListener());
	  
	  
	  
	  
  }
  public class LoginListener implements ActionListener
  {
	  public void actionPerformed(ActionEvent e)
	  {
		  if (e.getSource() == login)
		  {
			  JFrame log = new LoginGUI("Login To Your Account");
			  log.setMinimumSize(new Dimension(400,400));
		  }
	  }
  }
  public class SignupListener implements ActionListener{
	  public void actionPerformed(ActionEvent e)
	  {
		  if (e.getSource() == signup)
		  {
			  JFrame sig = new SignupGUI("Sign Up To Play Ship Wars!");
			  sig.setMinimumSize(new Dimension(400,400));
			  
		  }
	  }
  }
  public class SignupGUI extends JFrame
  {
	  private JTextField username1;
	  private JPasswordField password1;
	  private JButton checkavailable;
	  public SignupGUI(String title)
	  {
		  super(title);
		  JLabel back = new JLabel(new ImageIcon("/Users/brandonthomasdeere/Downloads/seapic.jpg"));
		  back.setLayout(new FlowLayout());
		  setLayout(new BoxLayout(getContentPane(), BoxLayout.PAGE_AXIS));
		  username1 = new JTextField(10);
		  password1 = new JPasswordField(10);
		  JLabel user = new JLabel("New Username:");
		  user.setFont(new Font("Serif", Font.BOLD, 44));
		  user.setForeground(Color.WHITE);
		  JLabel pass = new JLabel("New Password:");
		  pass.setFont(new Font("Serif", Font.BOLD, 44));
		  pass.setForeground(Color.WHITE);
		  Box temp = new Box(BoxLayout.Y_AXIS);
		  temp.setAlignmentX(CENTER_ALIGNMENT);
		  temp.setAlignmentY(CENTER_ALIGNMENT);
		  Box userbox = new Box(BoxLayout.X_AXIS);
		  Box passbox = new Box(BoxLayout.X_AXIS);
		  JPanel donepanel = new JPanel();
		  checkavailable = new JButton("Check If Available");
		  donepanel.add(checkavailable);
		  userbox.add(user);
		  userbox.add(username1);
		  passbox.add(pass);
		  passbox.add(password1);
		  userbox.setOpaque(false);
		  passbox.setOpaque(false);
		  donepanel.setOpaque(false);
		  setContentPane(back);
		  temp.add(userbox);
		  temp.add(passbox);
		  temp.add(donepanel);
		  back.add(temp);
		  
		  checkavailable.addActionListener(new Sign());
		  
		  pack();
		  
		  setVisible(true);
	  }
	  public class Sign implements ActionListener
	  {
		private String uss;
		private String pww;
		@SuppressWarnings("deprecation")
		public void actionPerformed(ActionEvent e)
		  {
			 
			  boolean available = true;
			  if (e.getSource() == checkavailable)
			  {
			    uss = username1.getText();
			    pww = password1.getText();
				String[] arr = Player.get_Username_array();
				for (int i = 0; i < arr.length; ++i)					// Checks if user name exists
				{
				  if (arr[i] == uss)
				  {
					available = false;
				  }
				}
				if (available)
				{
				  Player new_player = new Player(uss);
				  username1.setText("");
				  password1.setText("");
				  JOptionPane.showMessageDialog(null, "You have been successfully added to Ship Wars");
				  int answer = JOptionPane.showConfirmDialog(null, "Would you like to play now?", "Start now!", JOptionPane.YES_NO_OPTION);
				  if (answer == JOptionPane.YES_OPTION)
				  {
					System.out.print("passes");
					dispose();
					SetupShips setup = new SetupShips("Ship Wars Lobby");
					setup.setMinimumSize(new Dimension(400,400));
				  }
				}
				else
				{
				  JOptionPane.showMessageDialog(null, "Username already exists. Please try another");
				}
				  
			  }
		  }
	  }
  }
  public class LoginGUI extends JFrame
  {
	  private String us;
	  private String pw;
	  private JTextField username;
	  private JPasswordField password;
	  private JButton done;
	  public LoginGUI(String title)
	  {
		  super(title);
		  JLabel back = new JLabel(new ImageIcon("/Users/brandonthomasdeere/Downloads/seapic.jpg"));
		  back.setLayout(new FlowLayout());
		  setLayout(new BoxLayout(getContentPane(), BoxLayout.PAGE_AXIS));
		  username = new JTextField(10);
		  password = new JPasswordField(10);
		  JLabel user = new JLabel("Username:");
		  user.setFont(new Font("Serif", Font.BOLD, 44));
		  user.setForeground(Color.WHITE);
		  JLabel pass = new JLabel("Password:");
		  pass.setFont(new Font("Serif", Font.BOLD, 44));
		  pass.setForeground(Color.WHITE);
		  Box temp = new Box(BoxLayout.Y_AXIS);
		  temp.setAlignmentX(CENTER_ALIGNMENT);
		  temp.setAlignmentY(CENTER_ALIGNMENT);
		  Box userbox = new Box(BoxLayout.X_AXIS);
		  Box passbox = new Box(BoxLayout.X_AXIS);
		  JPanel donepanel = new JPanel();
		  done = new JButton("Done");
		  donepanel.add(done);
		  userbox.add(user);
		  userbox.add(username);
		  passbox.add(pass);
		  passbox.add(password);
		  userbox.setOpaque(false);
		  passbox.setOpaque(false);
		  donepanel.setOpaque(false);
		  setContentPane(back);
		  temp.add(userbox);
		  temp.add(passbox);
		  temp.add(donepanel);
		  back.add(temp);
		  
		  done.addActionListener(new DoneListener());
		  
		  pack();
		  
		  setVisible(true);
	  }
	  public class DoneListener implements ActionListener
	  {
		  public void actionPerformed(ActionEvent e)
		  {
			  if (e.getSource() == done)
			  {
				  us = username.getText();
				  pw = password.getText();
				  
				  String[] arr = Player.getPlayerArray();
				  for (int i = 0; i < arr.length; ++i)
				  {
					  if (arr[i].toString() == us)
					  {
						  JOptionPane.showMessageDialog(null, "You have successfully logged in");
					  }
				  }
				  dispose();
			  }
		  }
	  }
  }
  public class painting extends JComponent {

	  public void paint(Graphics g) {
	    g.drawRect (10, 10, 50, 50);  
	  }
	}
}

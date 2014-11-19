package eecs285.proj4;
import eecs285.proj4.StartupGUI;
import javax.swing.*;
import java.awt.*;

public class StartGame
{
  public static StartupGUI play;
  public static void main(String[] args)
  {
	  play = new StartupGUI();
	  play.setMinimumSize(new Dimension(400, 400));
	  play.pack();
	  play.setVisible(true);
	  play.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
  }
}

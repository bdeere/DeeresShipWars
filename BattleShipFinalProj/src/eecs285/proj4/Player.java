package eecs285.proj4;

import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JList;

import eecs285.proj4.allShips.*;

public class Player {
  
  private int player_count = 0;			// Player count
  private static String[] players = {"Computer"};		// Array of players
  private static DefaultListModel<String> ships;
  private static JList <String> shiplist;
  private String name;					// User name
  private String pass;
  private Aircraft ship1;				// Ships //
  private Battleship ship2;
  private Cruiser ship3;
  private Destroyer ship4;
  private Submarine ship5;
  public Player(String username)
  {
	  name = username;
	  ship1 = new Aircraft(null, null, "Aircraft");
	  ship2 = new Battleship(null, null, "Battleship");
	  ship3 = new Cruiser(null, null, "Cruiser");
	  ship4 = new Destroyer(null, null, "Destroyer");
	  ship5 = new Submarine(null, null, "Submarine");
	  players[player_count] = username;
	  player_count++;
	  addships();
	  
	  
  }
  public String get_Player()
  {
	return name;
  }
  public static String[] get_Username_array()
  {
	return players;
  }
  
  public void addships()
  {
	  ships = new DefaultListModel< String >();
	  shiplist = new JList< String >(ships);
	  ships.addElement(ship1.toString());
	  ships.addElement(ship2.toString());
	  ships.addElement(ship3.toString());
	  ships.addElement(ship4.toString());
	  ships.addElement(ship5.toString());
	  
  }
  public static DefaultListModel<String> getShipsListModel()
  {
	return ships;
  }
  public static JList<String> getJListShips()
  {
    return shiplist;
  }
  
  public static String[] getPlayerArray()
  {
	  return players;
  }
  public void pick_ship_locations()
  {
	  
  }
}

package eecs285.proj4.allShips;

import eecs285.proj4.Location;


public class Battleship extends AbstractShip
{
	public Battleship(Location startin, Location endin, String name)
	{
		super(startin, endin, name);
	}

	@Override
	public boolean isMoveHit(Location Move) {
		// TODO Auto-generated method stub
		return false;
	}
	public int getLength()
  	{
  		int length = 3;
  		return length;
  	}
}

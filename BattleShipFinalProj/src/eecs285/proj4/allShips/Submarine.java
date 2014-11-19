package eecs285.proj4.allShips;

import eecs285.proj4.Location;


public class Submarine extends AbstractShip
{
	public Submarine(Location xin, Location yin, String name)
	{
		super(xin, yin, name);
		
	}

	@Override
	public boolean isMoveHit(Location Move) {
		// TODO Auto-generated method stub
		return false;
	}
	public int getLength()
  	{
  		int length = 5;
  		return length;
  	}
}

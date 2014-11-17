package eecs285.proj4.allShips;

import eecs285.proj4.Location;;

public abstract class AbstractShip 
{
  private int size;
  private Location start;
  private Location end;
  private int numHits;
  private boolean isSunk;
  
  AbstractShip(Location inStart, Location inEnd)
  {
	  start = inStart;
	  end = inEnd; 
  }
  
  public abstract boolean isMoveHit(Location Move);
  
}

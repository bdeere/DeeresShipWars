package eecs285.proj4.allShips;

import eecs285.proj4.Location;;

public abstract class AbstractShip 
{
  private int size;
  private Location startLoc;
  private Location endLoc;
  private int numHits;
  private boolean isSunk;
  
  AbstractShip(Location inStart, Location inEnd)
  {
	  
  }
  
  public abstract boolean isMoveHit(Location Move);
  
}

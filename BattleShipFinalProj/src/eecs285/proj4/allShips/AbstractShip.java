package eecs285.proj4.allShips;

import eecs285.proj4.Location;;

public abstract class AbstractShip 
{
  private int size;
  private Location startLoc;
  private Location endLoc;
  private String shipTitle;
  private int numHits;
  private boolean isSunk;
  
  public AbstractShip(Location inStart, Location inEnd, String name)
  {
	  startLoc = inStart;
	  endLoc = inEnd;
	  shipTitle = name;
  }
  
  public abstract boolean isMoveHit(Location Move);
  
  @Override
  public String toString()
  {
    return shipTitle;
  }
  
  public abstract int getLength();
  
  
  
  public void setLocation(Location start, Location end)
  {
	  startLoc = start;
	  endLoc = end;
  }
  
}

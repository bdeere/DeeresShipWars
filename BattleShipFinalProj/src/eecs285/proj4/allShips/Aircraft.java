package eecs285.proj4.allShips;
import eecs285.proj4.*;

public class Aircraft extends AbstractShip
{
  private Location start;
  private Location end;
  private String shipTitle;
  
  public Aircraft(Location inStart, Location endStart, String name)
  {
	super(inStart, endStart, name);
	shipTitle = name;
	start = inStart;
	end = endStart;
  }

  	@Override
	public boolean isMoveHit(Location Move) {
	// TODO Auto-generated method stub
		return false;
  	}
  	
  	public int getLength()
  	{
  		int length = 2;
  		return length;
  	}

  
}

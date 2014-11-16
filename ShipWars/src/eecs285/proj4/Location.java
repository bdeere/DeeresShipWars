package eecs285.proj4;


public class Location 
{
  private int x;
  private int y;
  
  
  Location(int inX, int inY)
  {
	x = inX;
	y = inY; 
  }
  
  public static double getDistanceBetween(Location a, Location b)
  {
    return Math.sqrt(Math.pow(b.x - a.x, 2.0) + Math.pow(b.y - a.y, 2.0));
  }
  public void setXLocation(int inX)
  {
	x = inX;
  }
  public void setYLocation(int inY)
  {
	y = inY;
  }
  public int getXLocation()
  {
    return x;
  }
  public int getYLocation()
  {
	return y;
  }
}

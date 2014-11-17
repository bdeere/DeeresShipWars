package eecs285.proj4.allShips;
import eecs285.proj4.*;

public class Aircraft extends AbstractShip
{
 
  
  private static Location first;
  private static Location second;

  Aircraft()
  {
    super(first, second); 
  }

  @Override
  public boolean isMoveHit(Location Move)
  {
    // TODO Auto-generated method stub
    return false;
  }


}

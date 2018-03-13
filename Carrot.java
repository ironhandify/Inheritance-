
/**
 * Write a description of class Carrot here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class Carrot extends Consumables
{
   public Carrot (String name, ArrayList stats, int HealthPoints, int strength){
      super(name, stats);
      HealthPoints = 4;
      strength = 3;
    }
}

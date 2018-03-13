
/**
 * Write a description of class Potstickers here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class Potstickers extends Consumables
{
   public Potstickers (String name, ArrayList stats, int HealthPoints, int strength){
      super(name, stats);
      HealthPoints = 6;
      strength = 4;
}
}
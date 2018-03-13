
/**
 * Write a description of class StarFruit here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class StarFruit extends Consumables
{
   public StarFruit (String name, ArrayList stats, int HealthPoints, int strength){
      super(name, stats);
      HealthPoints = 9;
      strength = 9;
}
}

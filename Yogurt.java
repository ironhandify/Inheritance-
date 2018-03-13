
/**
 * Write a description of class Yogurt here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class Yogurt extends Consumables
{
   public Yogurt (String name, ArrayList stats, int HealthPoints, int strength){
      super(name, stats);
      HealthPoints = 5;
      strength = 7;
}
}

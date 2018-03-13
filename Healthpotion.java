
/**
 * Write a description of class Healthpotion here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class Healthpotion extends Consumables
{
  public Healthpotion (String name, ArrayList stats, int HealthPoints, int strength){
      super(name, stats);
      HealthPoints = 7;
      strength = 9;
    }
}

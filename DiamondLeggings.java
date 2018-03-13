
/**
 * Write a description of class SteelLeggings here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class DiamondLeggings extends Armor
{
  public DiamondLeggings(String name, ArrayList stats, int strength, int agility, int HealthPoints){
       super(name, stats);
       strength = 7;
       agility = 5;
       HealthPoints = 3;
       name = "Leggings";  
}
}

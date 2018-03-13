
/**
 * Write a description of class Leggings here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class Leggings extends Armor
{
   public Leggings(String name, ArrayList stats, int strength, int agility, int HealthPoints){
       super(name, stats);
       strength = 6;
       agility = 5;
       HealthPoints = 3;
       name = "Leggings";
    }
}

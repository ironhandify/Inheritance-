
/**
 * Write a description of class Helmet here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class Helmet extends Armor
{
   public Helmet(String name, ArrayList stats, int strength, int agility, int HealthPoints){
       super(name, stats);
       strength = 6;
       agility = 5;
       HealthPoints = 3;
       name = "Helmet";
    }
} 
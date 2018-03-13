
/**
 * Write a description of class SteelHelmet here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class DiamondHelmet extends Armor
{
   public DiamondHelmet(String name, ArrayList stats, int strength, int agility, int HealthPoints){
       super(name, stats);
       strength = 7;
       agility = 3;
       HealthPoints = 3;
       name = "Leggings";  
}
}

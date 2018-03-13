
/**
 * Write a description of class Chesplate here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class Chestplate extends Armor
{
    public Chestplate(String name, ArrayList stats, int strength, int agility, int HealthPoints){
        super(name, stats);
        strength = 5;
        agility = 5;
        HealthPoints = 3;
    }
}


/**
 * Write a description of class SteelChestPlate here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class DiamondChestPlate extends Armor
{
    public DiamondChestPlate(String name, ArrayList stats, int strength, int agility, int HealthPoints){
        super(name, stats);
        strength = 8;
        agility = 4;
        HealthPoints = 3;
    }
}

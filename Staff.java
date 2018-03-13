
/**
 * Write a description of class Staff here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class Staff extends Weapon
{
    public Staff(String name, ArrayList stats, int atk, int lvl, int strength){ 
        super(name, stats);
        atk = 5;//5);
        lvl = 3;//3);
        strength = 4;//4);
    }
}

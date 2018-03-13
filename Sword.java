
/**
 * Write a description of class Sword here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class Sword extends Weapon
{
   public Sword(String name, int atk, int lvl, int strength, ArrayList stats){
     super(name, stats);
     name = "Sword";
     atk = 5;//5);
     lvl = 2;//2);
     strength = 4;//4);
     
    }
}

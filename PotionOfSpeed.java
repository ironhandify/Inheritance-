
/**
 * Write a description of class PotionOfSpeed here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class PotionOfSpeed extends Consumables
{
   public PotionOfSpeed (String name, ArrayList stats, int agility){
      super(name, stats);
      agility = 9;
    }
}

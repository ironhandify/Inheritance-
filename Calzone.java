
/**
 * Write a description of class Calzone here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class Calzone extends Consumables
{
   public Calzone (String name, ArrayList stats, int HealthPoints, int strength){
      super(name, stats);
      HealthPoints = 3;
      strength = 5;
}
}

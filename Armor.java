
/**
 * Write a description of class Armor here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public abstract class Armor extends Item implements DefenseCommands
{
    int strength;
    int agility;
    int HealthPoints;
    public Armor(String name, ArrayList stats){
        super(name, stats);
        stats.add(strength);
        stats.add(agility);
        stats.add(HealthPoints);
        this.strength = strength;
        this.agility = agility;
        this.HealthPoints = HealthPoints;
    }
    
    public boolean blocked(){
     int i = strength + (int)(Math.random() * (HealthPoints*2));
     if(i > (strength/2)){
         return true;
        } else{
         return false;
        }
    }
    
}

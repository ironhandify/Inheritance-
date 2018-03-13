
/**
 * Write a description of class Consumables here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class Consumables extends Item
{
   int strength;
   int agility;
   int HealthPoints;
   public Consumables(String name, ArrayList stats){
       super(name, stats);
       this.strength = strength;
       this.agility = agility;
       this.HealthPoints = HealthPoints;
       stats.add(strength);
       stats.add(agility);
       stats.add(HealthPoints);
    }
    
   public int getStrength(){
       return strength;
    }
    
   public int getAgility(){
       return agility;
    }
    
   public int HealthPoints(){
       return HealthPoints;
    }
   
   public boolean Blocksystem(){
      int i = strength + (int)(Math.random() * (HealthPoints*2));
     if(i > (strength/2)){
         return true;
        } else{
         return false;
        }  
    }
}

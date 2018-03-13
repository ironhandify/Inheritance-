
/**
 * Write a description of class Weapon here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class Weapon extends Item implements WeaponInterface
{
    int atk;
    int lvl;
    int Strength;
   public Weapon(String name, ArrayList stats){
       super(name,stats);
       this.atk = atk;
       this.lvl = lvl;
       this.Strength = Strength;
       stats.add(atk);
       stats.add(lvl);
       stats.add(Strength);
    }
    
   public int attack(){
       return atk;
    }
    
   public boolean parry(){
       
      if(Player1.getStats().get(2) == 0){
          return false;
        } else{
          return true;
       } 
    }
   
    }


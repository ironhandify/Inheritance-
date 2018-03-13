
/**
 * Abstract class Character7 - write a description of the class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
import java.util.ArrayList; 
public abstract class Character
{
    String name;
    ArrayList stats;
    int Level;
    int HealthPoints;
    int Intelligence ;
    int Strength;
    int Agility;
    int dmge;
    public Character(String name){
        this.name = name;
        stats = new ArrayList<Integer>();
        stats.add(Level);
        stats.add(HealthPoints);
        stats.add(Intelligence);
        stats.add(Strength);
        stats.add(Agility);
        stats.add(dmge);
    }

    public String getName(){
        return name;   
    }

    public ArrayList getStats(){
     return stats;   
    }
    
    public int getLevel(){
        return Level;
    }
    
    public int getHealthPoints(){
        return HealthPoints;
    }
    
    public int getIntelligence(){
        return Intelligence;
    }
    
    public int getStrength(){
        return Strength;
    }
    
    public int getAgility(){
        return Agility;
    }
    
    public int getDmge(){
     return dmge;   
    }
}

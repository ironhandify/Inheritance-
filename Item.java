
/**
 * Write a description of class Item here.
 * 
 * @author Wiebe 
 * @version 1.2
 */
import java.util.ArrayList;
public class Item implements ItemInterface{
    //Implemented in your own way
    private String name;
    private ArrayList stats;
    int atk;
    int lvl;
    int HealthPoints;
    
    public Item(String name, ArrayList stats){
        this.name = name;
        this.stats = new ArrayList();
        stats.add(name);
    }
    
    public String getName(){
     return name;   
    }
    
    public ArrayList getStats(){
     return stats;   
    }
}

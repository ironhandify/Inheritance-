
/**
 * Write a description of class Player here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
import java.util.ArrayList;
public class Player1 extends Character
{
    int lvl;
    int hp;
    int strength;
    int intelligence;
    int agility;
    public Player1(String name, int lvl, int hp, int strength, int intelligence, int agility){
        super(name);
        this.lvl = lvl;
        this.hp = hp;
        this.strength = strength;
        this.intelligence = intelligence;
        this.agility = agility;
        stats.add(lvl);
        stats.add(hp);
        stats.add(strength);
        stats.add(intelligence);
        stats.add(agility);
    }
    
    public void Playername(){
        Scanner ask = new Scanner(System.in);
        boolean currentstate = false;
        
    }
}
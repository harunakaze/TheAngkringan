import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
import java.awt.Color;

/**
 * Write a description of class Life here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Life extends Actor
{
    private String nyawaString;
    
    List<Player> thePlayer;
    public Life()
    {
        setImage(new GreenfootImage("NYAWA : 3", 25, Color.BLACK, Color.WHITE));
    }
    public void addedToWorld(World world)
    {
        thePlayer = world.getObjects(Player.class);
    }
    public void act() 
    {   
        nyawaString = String.valueOf(thePlayer.get(0).nyawa);
        
        setImage(new GreenfootImage("NYAWA : " + nyawaString, 25, Color.BLACK, Color.WHITE));
    }      
}

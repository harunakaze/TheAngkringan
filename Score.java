import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
import java.awt.Color;

/**
 * Write a description of class Score here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Score extends Actor
{
    private String scoreString;
    
    List<Player> thePlayer;
    public Score()
    {
        setImage(new GreenfootImage("SCORE : 0", 25, Color.BLACK, Color.WHITE));
    }
    public void addedToWorld(World world)
    {
        thePlayer = world.getObjects(Player.class);
    }
    public void act() 
    {   
        scoreString = String.valueOf(thePlayer.get(0).totalBayar);
        
        setImage(new GreenfootImage("SCORE : " + scoreString, 25, Color.BLACK, Color.WHITE));
    }    
}

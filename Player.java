import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Benda
{
    int totalBayar;
    int nyawa;
    int multiplier;
    
    public Player()
    {
        kecepatanX = 1;
    }
    
    public void addedToWorld(World world)
    {
        posisiX = getX();
    }
    
    public void act() 
    {
        gerak();
    }
    
    public void gerak()
    {
        //Get Input
        if(Greenfoot.isKeyDown("right"))
            posisiX += kecepatanX;
        if(Greenfoot.isKeyDown("left"))
            posisiX -= kecepatanX;
        
        //Bound Check
        if(posisiX <= 0)
            posisiX = 0;
        if(posisiX >= 300)
            posisiX = 300;
        
        //Set position
        setLocation((int)posisiX, getY());
    }
}

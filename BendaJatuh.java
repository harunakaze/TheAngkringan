import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BendaJatuh here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class BendaJatuh extends Benda
{
    double posisiY;
    
    public void addedToWorld(World world)
    {
        posisiY = getY();
    }
    public void jatuh()
    {
        posisiY += super.kecepatanY;
        setLocation(getX(), (int)posisiY);
    }
}

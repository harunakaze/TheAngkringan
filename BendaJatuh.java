import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BendaJatuh here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class BendaJatuh extends Benda
{   
    Angkringan theWorld;
    public void jatuh()
    {
        posisiY += super.kecepatanY * theWorld.speedMultiplier;
        setLocation(getX(), (int)posisiY);
    }
}

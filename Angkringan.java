import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Angkringan here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Angkringan extends World
{
    GreenfootImage gambarAngkringan = new GreenfootImage("NasiKucing.png");
    
    /**
     * Constructor for objects of class Angkringan.
     * 
     */
    public Angkringan()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(300, 500, 1); 
        
        addObject(new Player(), 150, 450);
        
        addObject(new Makanan(1500, gambarAngkringan), 0, 0);
    }
}

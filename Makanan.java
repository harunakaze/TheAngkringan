import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Makanan here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Makanan extends BendaJatuh
{
    int harga;
    
    public Makanan(int harga, GreenfootImage gambar)
    {
        this.harga = harga;
        setImage(gambar);
        kecepatanY = 2;
    }
    
    public void act() 
    {
        super.jatuh();
    }
}

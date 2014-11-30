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
        
        addObject(new Makanan(1500, new GreenfootImage("Gorengan.png")), 100, 10);
        Makanan Gorengan = new Makanan(500, new GreenfootImage("Gorengan.png"));
       Makanan SateAyam = new Makanan(1000, new GreenfootImage("SateAyam.png"));
       Makanan Usus= new Makanan(1000, new GreenfootImage("Usus.png"));
       Makanan Keong = new Makanan(1000, new GreenfootImage("Keong.png"));
       Makanan BungkusNasi = new Makanan(-500, new GreenfootImage("BungkusNasi.png"));
       Makanan Karet  = new Makanan(-100, new GreenfootImage("Karet.png"));
       Makanan BatangCabe  = new Makanan(-50, new GreenfootImage("BatangCabe.png"));
       Makanan Arang  = new Makanan(-100, new GreenfootImage("Arang.png"));
       Makanan TusukSate  = new Makanan(-100, new GreenfootImage("TusukSate.png"));
       Makanan KulitPisang = new Makanan(-500, new GreenfootImage("KulitPisang.png"));
       
       
    }
    
}

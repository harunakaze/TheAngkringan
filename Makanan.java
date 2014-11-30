import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

/**
 * Write a description of class Makanan here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Makanan extends BendaJatuh
{
    int harga;
    boolean isSampah;
    
    List<Player> thePlayer;
    
    public Makanan(int harga, GreenfootImage gambar)
    {
        this.harga = harga;
        setImage(gambar);
        kecepatanY = 2;
        
        if(harga >= 0)
            this.isSampah = false;
        else
            this.isSampah = true;
    }
    
    public void addedToWorld(World world)
    {
        posisiY = getY();
        thePlayer = world.getObjects(Player.class);
        theWorld = (Angkringan)getWorld();
    }
    
    public void act() 
    {
        super.jatuh();
        cekAdaDiBawah();
    }
    
    void cekAdaDiBawah()
    {
        if(getY() >= 490)
        {
            if(!isSampah)
                thePlayer.get(0).ubahNyawa(-1);
            
            getWorld().removeObject(this);
        }
    }
}

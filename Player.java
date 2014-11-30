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
        
        makan();
    }
    
    public void gerak()
    {
        //Get Input
        if(Greenfoot.isKeyDown("right"))
            posisiX += kecepatanX;
        if(Greenfoot.isKeyDown("left"))
            posisiX -= kecepatanX;
        
        //Bound Check
        double imageOffset = getImage().getWidth() / 2;
        
        if(posisiX <= imageOffset)
            posisiX = imageOffset;
        if(posisiX >= 300 - imageOffset)
            posisiX = 300 - imageOffset;
        
        //Set position
        setLocation((int)posisiX, getY());
    }
    
    void ubahNyawa(int nilai)
    {
        nyawa += nilai;
        
        //Bound check
        if(nyawa > 3)
            nyawa = 3;
        if(nyawa < 0)
            nyawa = 0;
    }
    
    void ubahPoin(int nilai)
    {
        totalBayar += nilai;
        
        //Bound check
        if(totalBayar < 0)
            totalBayar = 0;
    }
    
    void makan()
    {
        if(isTouching(Makanan.class))
        {
            Makanan other = (Makanan)getOneIntersectingObject(Makanan.class);
            
            ubahPoin(other.harga);
            
            getWorld().removeObject(other);
        }
    }
}

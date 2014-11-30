import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

/**
 * Write a description of class Spawner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Spawner extends Actor
{
    ArrayList<Makanan> listMakanan = new ArrayList<Makanan>();
    
    Makanan nasiKucing = new Makanan(1500, new GreenfootImage("NasiKucing.png"));
    Makanan gorengan = new Makanan(500, new GreenfootImage("Gorengan.png"));
    Makanan sateAyam = new Makanan(1000, new GreenfootImage("SateAyam.png"));
    Makanan usus = new Makanan(1000, new GreenfootImage("Usus.png"));
    Makanan keong = new Makanan(1000, new GreenfootImage("Keong.png"));
    Makanan bungkusNasi = new Makanan(-500, new GreenfootImage("BungkusNasi.png"));
    Makanan karet = new Makanan(-100, new GreenfootImage("Karet.png"));
    Makanan batangCabe = new Makanan(-50, new GreenfootImage("BatangCabe.png"));
    Makanan arang = new Makanan(-100, new GreenfootImage("Arang.png"));
    Makanan tusukSate = new Makanan(-100, new GreenfootImage("TusukSate.png"));
    Makanan kulitPisang = new Makanan(-500, new GreenfootImage("KulitPisang.png"));
    
    //Delta Time
    double deltaTime;
    double lastTime;
    
    double waktuPanggil = 1000;
    double timer = 0;
    
    private void setDeltaTime()
    {
        double time = System.currentTimeMillis();
        
        deltaTime = time - lastTime;
        
        lastTime = time;
    }
    
    public Spawner()
    {
        //Adding to list
        listMakanan.add(nasiKucing);
        listMakanan.add(gorengan);
        listMakanan.add(sateAyam);
        listMakanan.add(usus);
        listMakanan.add(keong);
        listMakanan.add(bungkusNasi);
        listMakanan.add(karet);
        listMakanan.add(batangCabe);
        listMakanan.add(arang);
        listMakanan.add(tusukSate);
        listMakanan.add(kulitPisang);
    }
    
    public void act() 
    {
        setDeltaTime();
        
        muncul();
    }
    
    public void muncul()
    {
        timer += deltaTime;
        
        if(timer >= waktuPanggil)
        {
            int posisiX = Greenfoot.getRandomNumber(200) + 50;
            int pilihObjek = Greenfoot.getRandomNumber(10);
            
            getWorld().addObject(Instantiante(listMakanan.get(pilihObjek)), posisiX, 0);
            
            timer = 0;
        }
    }
    
    public Makanan Instantiante(Makanan objek)
    {
        Makanan baru = new Makanan(objek.harga, objek.getImage());
        
        return baru;
    }
}

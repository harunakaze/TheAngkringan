import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class Angkringan here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Angkringan extends World
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
    
    //DelTimer
    double deltaTime;
    double lastTime = System.currentTimeMillis();
    
    double waktuPanggil = 500;
    double timer = 0;
    
    double speedMultiplier = 1;
    
    double timerExtra = 0;
    double waktuSpawnerExtra = 10000;
    
    //Music-music
    GreenfootSound mainMenuSound = new GreenfootSound("main.mp3");
    
    public void act()
    {
        spawnerExtra();
        
        muncul();
        
        speedMultiplier += 0.001;
        
        waktuPanggil -= 0.05;
        //System.out.println(waktuPanggil);
        
        if(waktuPanggil <= 0)
            waktuPanggil = 0;
                
        setDeltaTime();
    }
    
    
    private void setDeltaTime()
    {
        double time = System.currentTimeMillis();
        
        deltaTime = time - lastTime;
        
        lastTime = time;
    }
    
    public Angkringan()
    {    
        // Create a new world with 300x500 cells with a cell size of 1x1 pixels.
        super(300, 500, 1); 
        
        addObject(new Player(), 150, 450);
        
        //Score
        addObject(new Score(), 200, 10);
        
        //Life
        addObject(new Life(), 50, 10);
        
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
        
        //Music
        mainMenuSound.playLoop();
    }
    
    public Makanan Instantiante(Makanan objek)
    {
        Makanan baru = new Makanan(objek.harga, objek.getImage());
        
        return baru;
    }
    
    public void muncul()
    {
        timer += deltaTime;
        
        if(timer >= waktuPanggil)
        {
            int posisiX = Greenfoot.getRandomNumber(200) + 50;
            int pilihObjek = Greenfoot.getRandomNumber(10);
            
            addObject(Instantiante(listMakanan.get(pilihObjek)), posisiX, 0);
            
            timer = 0;
        }
    }
    
    public void spawnerExtra()
    {
        timerExtra += deltaTime;
        
        if(timerExtra >= waktuSpawnerExtra)
        {
            addObject(new Spawner(), 0, 0);
            
            timerExtra = 0;
        }
    }
}

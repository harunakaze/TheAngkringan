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
    //Makanan
    ArrayList<Makanan> listMakanan = new ArrayList<Makanan>();
    
    Makanan nasiKucing = new Makanan(1500, new GreenfootImage("NasiKucing.png"));
    Makanan gorengan = new Makanan(500, new GreenfootImage("Gorengan.png"));
    Makanan sateAyam = new Makanan(1000, new GreenfootImage("SateAyam.png"));
    Makanan usus = new Makanan(1000, new GreenfootImage("Usus.png"));
    Makanan keong = new Makanan(1000, new GreenfootImage("Keong.png"));
    Makanan bungkusNasi = new Makanan(-1500, new GreenfootImage("BungkusNasi.png"));
    Makanan karet = new Makanan(-1000, new GreenfootImage("Karet.png"));
    Makanan batangCabe = new Makanan(-2000, new GreenfootImage("BatangCabe.png"));
    Makanan arang = new Makanan(-1000, new GreenfootImage("Arang.png"));
    Makanan tusukSate = new Makanan(-1000, new GreenfootImage("TusukSate.png"));
    Makanan kulitPisang = new Makanan(-2000, new GreenfootImage("KulitPisang.png"));
    
    //Bumbu
    ArrayList<Bumbu> listBumbu = new ArrayList<Bumbu>();
    
    Bumbu cabe = new Cabe();
    
    //DelTimer
    double deltaTime;
    double lastTime = System.currentTimeMillis();
    
    //timer makanan
    double waktuPanggil = 500;
    double timer = 0;
    
    //timer bumbu
    double waktuPanggilBumbu = 1500;
    double timerBumbu = 0;
    
    double speedMultiplier = 1;
    
    //timer extra
    double timerExtra = 0;
    double waktuSpawnerExtra = 10000;
    
    //Score
    public Life theLife;
    
    //Playyer
    public Player pemain;
    
    public void act()
    {
        spawnerExtra();
        
        muncul();
        
        munculBumbu();
        
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
        
        pemain = new Player();
        addObject(pemain, 150, 450);
        
        //Score
        addObject(new Score(), 200, 10);
        
        //Life
        theLife = new Life();
        addObject(theLife, 50, 10);
        
        //Adding to list makanan
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
        
        //Adding to list bumbu
        listBumbu.add(cabe);
    }
    
    public Makanan Instantiante(Makanan objek)
    {
        Makanan baru = new Makanan(objek.harga, objek.getImage());
        
        return baru;
    }
    
    public Bumbu buatBumbu (Bumbu objek)
    {
        Bumbu baru = new Cabe();
        baru = objek;
        
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
    
    public void munculBumbu()
    {
        timerBumbu += deltaTime;
        
        if(timer >= waktuPanggilBumbu)
        {
            int posisiX = Greenfoot.getRandomNumber(200) + 50;
            int pilihObjek = Greenfoot.getRandomNumber(10);
            
            addObject(Instantiante(listMakanan.get(pilihObjek)), posisiX, 0);
            
            timerBumbu = 0;
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

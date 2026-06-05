import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    public static int money = 100;
    public static int basicTowerPrice = 50;
    int worldTime = 0;
    int waveNumber = 1;
    int map [][] = {
            {0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,3,1,2,0,0},
            {1,2,0,0,0,1,0,3,2,0},
            {0,1,0,0,0,1,0,0,1,0},
            {0,1,0,3,1,4,0,0,1,0},
            {0,1,0,1,0,0,0,2,5,0},
            {0,1,0,1,0,0,0,1,0,0},
            {0,3,1,4,0,2,1,5,0,0},
            {0,0,0,0,0,1,0,0,0,0},
            {0,0,0,0,0,3,1,1,1,1},
        };
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(840, 600, 1); 
        Menu menu = new Menu();
        addObject(menu,720,320);
        MoneyDisplay moneyDisplay = new MoneyDisplay();
        addObject(moneyDisplay,720,30);
        Level1();
    }

    public void act(){
        addInTowers();
        worldTime++;
        spawnWave();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void Level1()
    {
        for(int i = 0;i < 10;i++){
            for(int j = 0; j < 10; j++){
                if(map[j][i] == 1){
                    addObject(new Road(true), i*60 + 30, j*60 + 30);
                }
                if(map[j][i] == 2){
                    addObject(new Road(90), i*60 + 30, j*60 + 30);
                }
                if(map[j][i] == 3){
                    addObject(new Road(0), i*60 + 30, j*60 + 30);
                }
                if(map[j][i] == 4){
                    addObject(new Road(270), i*60 + 30, j*60 + 30);
                }
                if(map[j][i] == 5){
                    addObject(new Road(180), i*60 + 30, j*60 + 30);
                }
            }
        }
    }

    public void addInTowers(){
        if(Greenfoot.mouseClicked(null) && Greenfoot.getMouseInfo().getActor() == null && money >= basicTowerPrice){
            addObject(new Tower(),(Greenfoot.getMouseInfo().getX() /60) * 60 + 30, (Greenfoot.getMouseInfo().getY()/60) * 60 + 30);
            money -= basicTowerPrice;
        }
    }
    public void spawnWave(){
        if(worldTime % 20 == 0){
            addObject(new Enemy(waveNumber),5,153);
        }
        if(worldTime % 400 == 399){
            waveNumber++;
        }
    }
}

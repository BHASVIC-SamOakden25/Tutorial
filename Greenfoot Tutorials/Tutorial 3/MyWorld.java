import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600, 1); 
        prepare();
    }
    
    public void act(){
        if (Greenfoot.getRandomNumber(100)<1){
            addEnemy1();
        }
        if (Greenfoot.getRandomNumber(150)<1){
            addEnemy2();
        }
    }
    public void addEnemy1(){
        Enemy1 Enemy1 = new Enemy1();
        addObject(Enemy1, Greenfoot.getRandomNumber(600), 0);
    }
    
    public void addEnemy2(){
        Enemy2 Enemy2 = new Enemy2();
        addObject(Enemy2, Greenfoot.getRandomNumber(600), 0);
        
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Player player = new Player();
        addObject(player,271,532);
        Enemy1 enemy1 = new Enemy1();
        addObject(enemy1,297,184);
        Enemy2 enemy2 = new Enemy2();
        addObject(enemy2,313,235);
        enemy2.setLocation(483,176);
        removeObject(enemy1);
        removeObject(enemy2);
    }
}

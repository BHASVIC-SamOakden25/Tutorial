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
        super(600, 400, 1); 
        prepare();
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Player player = new Player();
        addObject(player,193,191);
        Enemy bee = new Enemy();
        addObject(bee, 50, 200);
        Enemy bee1 = new Enemy();
        addObject(bee1, 200, 300);
        Enemy bee2 = new Enemy();
        addObject(bee2, 320, 250);
        Enemy bee3 = new Enemy();
        addObject(bee3, 500, 100);
    }
}

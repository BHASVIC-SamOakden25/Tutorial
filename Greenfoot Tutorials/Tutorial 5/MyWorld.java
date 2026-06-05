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
        super(900, 600, 1); 
        prepare();
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Rocket rocket = new Rocket();
        addObject(rocket,469,325);
        Rocks rocks = new Rocks();
        addObject(rocks,Greenfoot.getRandomNumber(900), Greenfoot.getRandomNumber(600));
        Rocks rocks2 = new Rocks();
        addObject(rocks2,Greenfoot.getRandomNumber(900), Greenfoot.getRandomNumber(600));
        Rocks rocks3 = new Rocks();
        addObject(rocks3,Greenfoot.getRandomNumber(900), Greenfoot.getRandomNumber(600));
        Rocks rocks4 = new Rocks();
        addObject(rocks4,Greenfoot.getRandomNumber(900), Greenfoot.getRandomNumber(600));
        Rocks rocks5 = new Rocks();
        addObject(rocks5,Greenfoot.getRandomNumber(900), Greenfoot.getRandomNumber(600));
    }
}

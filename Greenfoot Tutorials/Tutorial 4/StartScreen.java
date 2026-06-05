import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StartScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StartScreen extends World
{

    /**
     * Constructor for objects of class StartScreen.
     * 
     */
    public StartScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        GreenfootImage text = new GreenfootImage("Press space to start", 40, Color.BLACK, new Color(0,0,0,0));
        getBackground().drawImage(text, 
            (getWidth() - text.getWidth()) / 2, 
            (getHeight() - text.getHeight()) / 2);
    }
    public void act(){
        if (Greenfoot.isKeyDown("space")){
            Greenfoot.setWorld(new Background());
        }
    }
}

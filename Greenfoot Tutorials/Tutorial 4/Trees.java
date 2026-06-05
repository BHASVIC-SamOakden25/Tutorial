import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Trees here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Trees extends Actor
{
    /**
     * Act - do whatever the Trees wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Trees(){
        getImage().scale(getImage().getWidth() * 2,getImage().getHeight() * 3);
    }
    public void act()
    {
        if (Greenfoot.isKeyDown("left")){
            move(2);
        }
        if (Greenfoot.isKeyDown("right")){
            move(-2);
        }
        
        if (getX() == 0){
            setLocation(getWorld().getWidth() - 1, getY());
        }
    }
}

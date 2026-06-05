import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ground here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ground extends Actor
{
    /**
     * Act - do whatever the Ground wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Ground(){
        getImage().scale(getImage().getWidth() * 6,getImage().getHeight() * 2);
    }
    
    public void act()
    {
        if (Greenfoot.isKeyDown("left")){
            move(4);
        }
        if (Greenfoot.isKeyDown("right")){
            move(-4);
        }
        
        if (getX() == 0){
            setLocation(getWorld().getWidth() - 1, Greenfoot.getRandomNumber(200) + 290);
        }
    }
}

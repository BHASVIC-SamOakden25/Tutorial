import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Rocks here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rocks extends SpaceActors
{
    int horizontalSpeed = Greenfoot.getRandomNumber(5) + 1;
    int verticalSpeed = Greenfoot.getRandomNumber(5) + 1;
    /**
     * Act - do whatever the Rocks wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Rocks(){
        if(Greenfoot.getRandomNumber(2) == 1){
            horizontalSpeed = -horizontalSpeed;
        }
        if(Greenfoot.getRandomNumber(2) == 1){
            verticalSpeed = -verticalSpeed;
        }
    }
    public void act()
    {
        // Add your action code here.
    }
}

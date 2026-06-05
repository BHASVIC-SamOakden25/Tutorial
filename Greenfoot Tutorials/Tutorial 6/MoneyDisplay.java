import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MoneyDisplay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MoneyDisplay extends Actor
{
    /**
     * Act - do whatever the MoneyDisplay wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public MoneyDisplay(){
        setImage(new GreenfootImage("Money: "+ MyWorld.money,50, Color.BLACK, new Color(0,0,0,0)));
    }
    public void act()
    {
        setImage(new GreenfootImage("Money: " + MyWorld.money,50, Color.BLACK, new Color(0,0,0,0)));
        if(Greenfoot.mouseClicked(this)){
            MyWorld.money = 100;
        }
    }
}

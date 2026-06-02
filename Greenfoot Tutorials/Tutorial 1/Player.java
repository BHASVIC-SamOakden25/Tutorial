import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    int speed = 2;
    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        moveAround();
        hitEnemy();
        youWin();
    }
    
    public void moveAround()
    {
        move(speed);
        if (Greenfoot.isKeyDown("right"))
        {
            turn(2);    
        }
        if (Greenfoot.isKeyDown("left"))
        {
            turn(-2);    
        }
        if (Greenfoot.isKeyDown("space"))
        {
            if (speed < 10){
                speed += 1;
            }
        }
        if (Greenfoot.isKeyDown("v"))
        {
            if (speed > 2){
                speed -= 1;
            }
        }
    }
    
    public void hitEnemy(){
        if (isTouching(Enemy.class)){
            getWorld().addObject(new YouLose(), 300, 200);
            Greenfoot.stop();
        }
    }
    
    public void youWin(){
        if (getY() >= 398){
            getWorld().addObject(new YouWin(), 300, 200);
            Greenfoot.stop();
        }
    }
}

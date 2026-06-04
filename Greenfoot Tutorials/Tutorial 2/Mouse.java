import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Mouse here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mouse extends Actor
{
    /**
     * Act - do whatever the Mouse wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Mouse(){
        getImage().scale(getImage().getWidth()/ 2,getImage().getHeight() / 2);
    }
    public void act()
    {
        moveAround();
        hitFood();
    }
    
    public void moveAround()
    {
        if (Greenfoot.isKeyDown("right"))
        {
            setLocation(getX() + 1,getY());
            if (hitWall()){
                setLocation(getX() - 1,getY());
            }
        }
        if (Greenfoot.isKeyDown("left"))
        {
            setLocation(getX() - 1, getY());  
            if (hitWall()){
                setLocation(getX() + 1,getY());
            }
        }
        if (Greenfoot.isKeyDown("up"))
        {
            setLocation(getX(), getY() - 1);
            if (hitWall()){
                setLocation(getX(),getY() + 1);
            }
        }
        if (Greenfoot.isKeyDown("down"))
        {
            setLocation(getX(),getY() + 1);
            if (hitWall()){
                setLocation(getX(),getY() - 1);
            }
        }
    }
    
    public boolean hitWall(){
        if (isTouching(Walls.class)){
            return true;
        }else{
            return false;
        }
    }
    
    public void hitFood(){
        if (getOneIntersectingObject(Cheese.class) != null){
            getWorld().removeObject(getOneIntersectingObject(Cheese.class));
        }
        
        if (isTouching(Enemy.class)){
            setLocation(100,516);
        }
        
        if (isTouching(Goal.class)){
            Greenfoot.stop();
        }
    }
}

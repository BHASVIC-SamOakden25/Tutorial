import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    int vSpeed = 4;
    int acceleration = 1;
    int jumpHeight = -20;
    int collect = 0;
    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        moveAround();
        checkFalling();
        reset();
        collectCoin();
        findDoor();
    }
    public void moveAround(){
        if ((Greenfoot.isKeyDown("space"))&&(onGround() == true)){
            vSpeed = jumpHeight;
            fall();
        }
    }
    private void fall(){
        setLocation(getX(), getY() + vSpeed);
        vSpeed = vSpeed + acceleration;
    }
    public boolean onGround(){
        Actor under = getOneObjectAtOffset(0,getImage().getHeight()/2, Ground.class);
        return under != null;
    }
    public void checkFalling(){
        if (onGround() == false){
            fall();
        }
        if (onGround() == true){
            vSpeed = 0;
        }
    }
    public void reset(){
        if(getY() >= 599){
            setLocation(150,300);
            vSpeed = -10;
        }
    }
    public void collectCoin(){
        Actor Coin = getOneIntersectingObject(coin.class); 
        if (Coin != null){
            getWorld().removeObject(Coin);
            collect++;
        }
        if (collect == 10){
            getWorld().addObject(new Door(), getWorld().getWidth(), 450);
            collect = 11;
        }
    }
    public void findDoor(){
        Actor Door = getOneIntersectingObject(Door.class);
        if(Door != null){
            Greenfoot.setWorld(new Background2());
        }
    }
}

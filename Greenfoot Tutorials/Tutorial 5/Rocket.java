import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Rocket here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rocket extends SpaceActors
{
    int horizontalSpeed = 0;
    int verticalSpeed = 0;
    boolean fired = false;
    Projectile projectile = new Projectile();
    /**
     * Act - do whatever the Rocket wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Rocket(){
        getImage().scale(getImage().getWidth() / 2,getImage().getHeight() / 2);
    }
    public void act()
    {
        turnCommand();
        accelerateOnCommand();
        setLocation(getX() + horizontalSpeed, getY() + verticalSpeed);
        bounceAtEdge();
        fireOnCommand();
    }
    public void turnCommand(){
        if(Greenfoot.isKeyDown("right")){
            setRotation(0);
        }
        if(Greenfoot.isKeyDown("left")){
            setRotation(180);
        }
        if(Greenfoot.isKeyDown("down")){
            setRotation(90);
        }
        if(Greenfoot.isKeyDown("up")){
            setRotation(270);
        }
    }
    public void accelerateOnCommand(){
        if(Greenfoot.isKeyDown("space")){
            if(getRotation() == 0){
                horizontalSpeed++;
            }
            if(getRotation() == 90){
                verticalSpeed++;
            }
            if(getRotation() == 180){
                horizontalSpeed--;
            }
            if(getRotation() == 270){
                verticalSpeed--;
            }
        }
    }
    public void bounceAtEdge(){
        if(getX() == 0){
            horizontalSpeed = horizontalSpeed * - 1;
            turn(180); 
        }
        if(getX() == 899){
            horizontalSpeed = horizontalSpeed * - 1;
            turn(180);
        }
        if(getY() == 0){
            verticalSpeed = verticalSpeed * - 1;
            turn(180);
        }
        if(getY() == 599){
            verticalSpeed = verticalSpeed * - 1;
            turn(180);
        }
    }
    public void fireOnCommand(){
        if((Greenfoot.isKeyDown("v")) && (fired == false)){
            getWorld().addObject(projectile, getX(), getY());
            projectile.setRotation(getRotation());
            fired = true;
        }
        if (!Greenfoot.isKeyDown("v")){
            fired = false;
        }
    }
    
}

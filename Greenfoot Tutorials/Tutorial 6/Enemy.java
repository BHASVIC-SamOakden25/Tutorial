import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy extends Actor
{
    /**
     * Act - do whatever the Enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public int health = 5;
    
    public Enemy(int level){
        if(level == 1){
            setImage("spider.png");
        }
        if (level == 2){
            setImage("snake2.png");
        }
    }
    public void act()
    {
        moveAlongPath();
        hitProjectile();
    }
    public void moveAlongPath(){
        move(2);
        List <Road> road90 = getObjectsAtOffset(-30, 0, Road.class);
        for(Road roads: road90){
            if(roads.straight == false && getRotation() == 0){
                setRotation(roads.turn);
            }
        }
        
        List <Road> road0 = getObjectsAtOffset(0, -30, Road.class);
        for(Road roads: road0){
            if(roads.straight == false && getRotation() == 90){
                setRotation(roads.turn);
            }
        }
        
        List <Road> road270 = getObjectsAtOffset(30, 0, Road.class);
        for(Road roads: road270){
            if(roads.straight == false && getRotation() == 180){
                setRotation(roads.turn);
            }
        }
        
        List <Road> road180 = getObjectsAtOffset(0, 30, Road.class);
        for(Road roads: road180){
            if(roads.straight == false && getRotation() == 270){
                setRotation(roads.turn);
            }
        }
    }
    public void hitProjectile(){
        Actor projectile = getOneIntersectingObject(Projectile.class);
        if(projectile!=null){
            getWorld().removeObject(projectile);
            health--;
        }
        
        if(health == 0){
            getWorld().removeObject(this);
            MyWorld.money += 10;
        }
        
        if(getY() >= 599){
            MyWorld.money -= 10;
            getWorld().removeObject(this);
        }
    }
    
    
}

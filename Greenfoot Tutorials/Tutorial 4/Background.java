import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Background here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Background extends World
{

    /**
     * Constructor for objects of class Background.
     * 
     */
    public Background()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1); 
        prepare();
    }
    public void act(){
        if(Greenfoot.getRandomNumber(500) <= 2)
        {
            addObject(new coin(), getWidth() - 10, Greenfoot.getRandomNumber(250)+250);
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Ground ground = new Ground();
        addObject(ground,81,527);
        Ground ground2 = new Ground();
        addObject(ground2,371,429);
        Ground ground3 = new Ground();
        addObject(ground3,664,369);
        Ground ground4 = new Ground();
        addObject(ground4,931,319);
        Ground ground5 = new Ground();
        addObject(ground5,386,252);
        Ground ground6 = new Ground();
        addObject(ground6,83,153);
        Player player = new Player();
        addObject(player,38,453);
        player.setLocation(75,499);
        Cloud cloud = new Cloud();
        addObject(cloud,620,142);
        removeObject(ground5);
        removeObject(ground6);
        Cloud cloud2 = new Cloud();
        addObject(cloud2,80,104);
        Cloud cloud3 = new Cloud();
        addObject(cloud3,304,249);
        Cloud cloud4 = new Cloud();
        addObject(cloud4,907,55);
        ground2.setLocation(392,451);
        ground3.setLocation(647,406);
        ground4.setLocation(898,350);
        ground4.setLocation(908,357);
        ground4.setLocation(927,344);
        ground2.setLocation(412,449);
        ground2.setLocation(372,453);
        ground2.setLocation(352,461);
        Trees trees = new Trees();
        addObject(trees,915,547);
        trees.setLocation(925,547);
        Trees trees2 = new Trees();
        addObject(trees2,789,579);
        trees2.setLocation(805,541);
        Trees trees3 = new Trees();
        addObject(trees3,700,568);
        trees3.setLocation(710,551);
        Trees trees4 = new Trees();
        addObject(trees4,598,581);
        Trees trees5 = new Trees();
        addObject(trees5,492,568);
        trees5.setLocation(496,542);
        Trees trees6 = new Trees();
        addObject(trees6,386,574);
        trees6.setLocation(390,563);
        Trees trees7 = new Trees();
        addObject(trees7,294,567);
        Trees trees8 = new Trees();
        addObject(trees8,200,580);
        trees8.setLocation(199,546);
        Trees trees9 = new Trees();
        addObject(trees9,105,561);
        trees9.setLocation(142,576);
        trees9.setLocation(120,554);
        ground.setLocation(47,478);
        player.setLocation(79,433);
        ground2.setLocation(318,403);
        ground3.setLocation(602,347);
        ground4.setLocation(878,293);
        ground4.setLocation(916,291);
        ground3.setLocation(700,343);
        ground2.setLocation(422,399);
        ground2.setLocation(402,411);
        ground2.setLocation(356,423);
        ground3.setLocation(632,354);
    }
}

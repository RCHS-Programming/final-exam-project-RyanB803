import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class polarBear here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class polarBear extends Actor
{
    /**
     * Act - do whatever the polarBear wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int speed;
    public polarBear (int setSpeed)
    {
        speed = setSpeed;
    }
    public void act() 
    {
      move(speed); 
      restart();
        if (isAtEdge())
        {
            setLocation (25, getY());
            
        }
        
    }   
    public void restart()
    {
        if (isTouching( seals.class))
        {
           Greenfoot.stop(); 
        }
    }
}

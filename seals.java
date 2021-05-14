import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class seals here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class seals extends Actor
{
    /**
     * Act - do whatever the seals wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        checkKeyPress();
        collecting();
    }   
    
    public void checkKeyPress()
    {
        if(Greenfoot.isKeyDown("up"))
        {
            setLocation(getX(), getY()-5);
        }
        if(Greenfoot.isKeyDown("down"))
        {
          setLocation(getX(), getY()+5);  
        }
        if(Greenfoot.isKeyDown("right"))
        {
          setLocation(getX()+5, getY());  
        }
        if(Greenfoot.isKeyDown("left"))
        {
          setLocation(getX()-5, getY());  
        }
    }
    public void collecting()
    {
        
    }
}   

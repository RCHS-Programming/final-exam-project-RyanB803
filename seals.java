import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class seals here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class seals extends Actor
{
    private int points; 
   
    /**
     * Act - do whatever the seals wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        checkKeyPress();
        collecting();
        scoreBoard();
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
       if (isTouching(cherry.class))
       {
           removeTouching(cherry.class);
           points=points+1;
           getWorld().addObject(new cherry(), Greenfoot.getRandomNumber(800),Greenfoot.getRandomNumber(500));
       }
       if(points==5)
       {
           getWorld().addObject(new polarBear(5), Greenfoot.getRandomNumber(790),Greenfoot.getRandomNumber(500));
           points=0; 
       }
   
    }
    
    public void scoreBoard()
    {
       getWorld().showText("Cherries:"+points, 55,55); 
      
    }
}   

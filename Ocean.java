import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ocean here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ocean extends World
{
    private int points; 
    /**
     * Constructor for objects of class Ocean.
     * 
     */
    public Ocean()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        addObject(new seals(),40, 550); 
        addObject(new polarBear(3), Greenfoot.getRandomNumber(800),Greenfoot.getRandomNumber(500));
        addObject(new polarBear(3), Greenfoot.getRandomNumber(800),Greenfoot.getRandomNumber(500));
        addObject(new cherry(), Greenfoot.getRandomNumber(800),Greenfoot.getRandomNumber(500));
        addObject(new cherry(), Greenfoot.getRandomNumber(800),Greenfoot.getRandomNumber(500));
    }
    public void increese()
    {
        
    }
    
    
}

import greenfoot.*;  // (Actor, World, Greenfoot, GreenfootImage)

public class CrabWorld extends World
{
    /**
     * Create the crab world (the beach). Our world has a size 
     * of 560x560 cells, where every cell is just 1 pixel.
     */
    public CrabWorld() 
    {
        super(760, 760, 1);

        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Worm worm = new Worm();
        addObject(worm,594,642);
        Worm worm2 = new Worm();
        addObject(worm2,84,116);
        Worm worm3 = new Worm();
        addObject(worm3,650,110);
        Worm worm4 = new Worm();
        addObject(worm4,117,657);
        Worm worm5 = new Worm();
        addObject(worm5,407,240);
        Worm worm6 = new Worm();
        addObject(worm6,372,588);
        Worm worm7 = new Worm();
        addObject(worm7,320,411);
        lobster lobster = new lobster();
        addObject(lobster,702,441);
        lobster lobster2 = new lobster();
        addObject(lobster2,385,87);
        lobster lobster3 = new lobster();
        addObject(lobster3,56,425);
        Crab crab = new Crab();
        addObject(crab,362,712);
        crab.setLocation(359,710);
        worm.setLocation(595,644);
        worm4.setLocation(118,674);
        worm6.setLocation(358,585);
        worm7.setLocation(323,404);
        worm2.setLocation(83,106);
        worm5.setLocation(389,225);
        worm3.setLocation(663,105);
    }
}
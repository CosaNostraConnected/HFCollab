package net.hackforums.vanilla.zombie;

import java.util.Random;

public class Main {
    /**
     * The main function
     * @param args The cl arguments (Unused)
     */
    public static void main(String[] args) {


        Random random = new Random();

        Grid grid = new Grid(10, 10);
        grid.set(EntityType.HUMAN, new Location(2, 2));
        grid.set(EntityType.ZOMBIE, new Location(grid.getRows() - 1, grid.getColumns() - 1));
        grid.display();

        //Now I'm stuck here: I haven't found a cross platform key listener...
    


    }
}

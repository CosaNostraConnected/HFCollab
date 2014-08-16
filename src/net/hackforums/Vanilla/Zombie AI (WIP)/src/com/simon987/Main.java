package net.hackforums.Vanilla;

import java.util.Random;

public class Main {

    public static void main(String[] args) {


        Random random = new Random();

        Grid grid = new Grid(10, 10);
        grid.add(Entities.HUMAN, new Location(2, 2));
        grid.add(Entities.ZOMBIE, new Location(grid.getRows() - 1, grid.getColumns() - 1));
        grid.display();

        //Now I'm stuck here: I haven't found a cross platform key listener...



    }
}

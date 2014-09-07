package net.hackforums.vanilla.gameoflife;

import java.util.Random;

public class Grid {

    private static int rows;
    private static int columns;
    private static Entity[] cells;

    /**
     * @return The grid's amount of rows
     */
    public int getRows() {
        return rows;
    }

    /**
     *
     * @return The grid's amount of columns
     */
    public int getColumns() {
        return columns;
    }

    public int getGridSize() {
        return cells.length;
    }

    /**
     * Grid class constructor
     * @param row The amount of rows to initialize
     * @param column The amount of columns to initialize
     * @param rand The random number for various tasks
     */
    public Grid(int row, int column,Random rand) {
        rows = row;
        columns = column;
        cells = new Entity[rows*columns];

        //Fill the grid with death cells
        int cellID = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.println("Cell " + cellID + " created");
                cells[cellID] = new Entity(EntityStates.DEAD,new Location(j+1,i+1));
                ++cellID;
            }
        }

        //Put some alive cells
        for(Entity cell : cells) {
            //Set cells alive (20% chance)
            if(rand.nextInt(101) < 20) {
                cell.setState(EntityStates.ALIVE);
            }
        }

    }

    /**
     * Sets a cell's type
     * @param type The type of the cell
     * @param loc The location of the cell
     */
    public void set(EntityStates type,Location loc) {
        cells[getCellID(loc)].setState(type);
    }

    /**
     * Convert Location to the cell ID
     * @param loc Location of the cell
     * @return The cell ID
     */
    public int getCellID(Location loc) {
        return (loc.y -1) * getRows() + (loc.x -1);
    }

    /**
     * Convert cell ID to Location
     * @param cellID The cell ID
     * @return The Location of the cell
     */
    public Location getLocation(int cellID) {
        return cells[cellID].getLocation();
    }

    /**
     * Loop trough the array of cells and display its "icon" depending on its type
     */
    public void display() {
        int cellID = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(cells[cellID].getState().getTextualIcon());
                ++cellID;
            }
            System.out.println();
        }
    }

    public Entity getEntity(int cellID) {
        return cells[cellID];
    }
}

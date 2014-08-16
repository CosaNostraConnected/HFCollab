package net.hackforums.vanilla.zombie;

/**
 * Created by Simon on 2014-08-15.
 */
public class Grid {


    private static int rows;
    private static int columns;
    private static Entity[] cells;

    public int getRows() {
        return rows;
    }
    public int getColumns() {
        return columns;
    }

    public Grid(int row, int column) {

        rows = row;
        columns = column;
        cells = new Entity[rows*columns];

        //Fill the grid with blank cells
        int cellID = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.println("Cell " + cellID + " created");
                cells[cellID] = new Entity(Entities.BLANK,new Location(j+1,i+1));
                ++cellID;
            }
        }

    }
    //---
    public void add(Entities type,Location loc){

        cells[getCellID(loc)].setType(type);
    }
    public int getCellID(Location loc){
        return (loc.y -1) * getRows() + (loc.x -1);
    }
    public Location getLocation(int cellID){
        return cells[cellID].getLocation();
    }
    public void display(){
        int cellID = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(cells[cellID].getType());
                ++cellID;
            }
            System.out.println();
        }
    }
}

package net.hackforums.vanilla.zombie;

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

    /**
     * Grid class constructor
     * @param row The amount of rows to initialise
     * @param column The amount of columns to initialise
     */
    public Grid(int row, int column) {

        rows = row;
        columns = column;
        cells = new Entity[rows*columns];

        //Fill the grid with blank cells
        int cellID = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.println("Cell " + cellID + " created");
                cells[cellID] = new Entity(EntityType.BLANK,new Location(j+1,i+1));
                ++cellID;
            }
        }

    }

    /**
     * Sets a cell's type
     * @param type The type of the cell
     * @param loc The location of the cell
     */
    public void set(EntityType type,Location loc){

        cells[getCellID(loc)].setType(type);
    }

    /**
     * Convert Location to the cell ID
     * @param loc Location of the cell
     * @return The cell ID
     */
    public int getCellID(Location loc){
        return (loc.y -1) * getRows() + (loc.x -1);
    }

    /**
     * Convert cell ID to Loation
     * @param cellID The cell ID
     * @return The Location of the cell
     */
    public Location getLocation(int cellID){
        return cells[cellID].getLocation();
    }

    /**
     * Loop trough the array of cells and display its "icon" depending on its type
     */
    public void display(){
        int cellID = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(cells[cellID].getType().getTextualIcon());
                ++cellID;
            }
            System.out.println();
        }
    }
}

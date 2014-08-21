package net.hackforums.vanilla.gameoflife;

public class Game {

    /**
     * Next generation (This is where it decide who survive/die/become alive
     * @param grid The grid object
     */
    public static void next(Grid grid) {
        for (int i = 0; i < (grid.getColumns() * grid.getRows()); i++) {
            getNeighbors(grid, i);

            if(grid.getEntity(i).getState().equals(EntityStates.ALIVE)) {
                if(grid.getEntity(i).getLiveNeighbor() < 2 || grid.getEntity(i).getLiveNeighbor() > 3) {
                    grid.getEntity(i).setState(EntityStates.DEAD);
                }
            } else if(grid.getEntity(i).getLiveNeighbor() == 3) {
                grid.getEntity(i).setState(EntityStates.ALIVE);
            }
        }
    }

    /**
     * Set the number of living neighbors for a cell
     * @param grid the grid object
     * @param cellID The cell ID
     */
    public static void getNeighbors(Grid grid, int cellID){
        Entity currentCell = grid.getEntity(cellID);
        currentCell.setLiveNeighbor(0);

        int currentTargetID = 0;
        for(int x = 0; x < 3; x++) {
            for(int y = 0; y < 3; y++) {
                currentTargetID = getTargetOffset(x, y, grid.getRows()) + cellID;
                if(currentTargetID >= 0 && currentTargetID < grid.getGridSize()) {
                    if(grid.getEntity(cellID + getTargetOffset(x, y, grid.getRows())).getState() == EntityStates.ALIVE) {
                        currentCell.setLiveNeighbor(currentCell.getLiveNeighbor() + 1);
                    }
                }
            }
        }
    }

    private static int getTargetOffset(int x, int y, int width) {
        return x + (width * y) - width - 1;
    }
}

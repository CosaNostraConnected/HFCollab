package net.hackforums.vanilla.gameOfLife;


public class Game {
    /**
     * Next generation (This is where it decide who survive/die/become alive
     * @param grid The grid object
     */
	public static void next(Grid grid){

		for (int i = 0; i < (grid.getColumns() * grid.getRows()); i++) {
			
			getNeighbors(grid, i);

			if(grid.getEntity(i).getType().equals(Entities.ALIVE)){
				if(grid.getEntity(i).getLiveNeighbor() < 2 || grid.getEntity(i).getLiveNeighbor() > 3){
                    grid.getEntity(i).setType(Entities.DEATH);
				}
			}else if(grid.getEntity(i).getLiveNeighbor() == 3){
                grid.getEntity(i).setType(Entities.ALIVE);
				}

		}
		
	}

    /**
     * Set the number of living neighbors for a cell
     * @param grid the grid object
     * @param cellID The cell ID
     */
	public static void getNeighbors(Grid grid, int cellID){
        grid.getEntity(cellID).setLiveNeighbor(0);

		//top = cellID - sizeY
		//bottom = cellID + sizeY
		//Right = cellI + 1
		//left = cellID - 1
		//top-left = cellID -sizeY -1
		//top-right = cellID -sizeY +1
		//bottom-left = cellID +sizeY -1
		//bottom-left = cellID +sizeY +1
        try {
            if(grid.getEntity(cellID-grid.getRows()).getType().equals(Entities.ALIVE)) {
                grid.getEntity(cellID).setLiveNeighbor(grid.getEntity(cellID).getLiveNeighbor() + 1);
            }
        } catch (Exception e) {
        }
        try {
            if(grid.getEntity(cellID+grid.getRows()).getType().equals(Entities.ALIVE)) {
                grid.getEntity(cellID).setLiveNeighbor(grid.getEntity(cellID).getLiveNeighbor() + 1);
            }
        } catch (Exception e) {
        }
        try {
            if(grid.getEntity(cellID+1).getType().equals(Entities.ALIVE)) {
                grid.getEntity(cellID).setLiveNeighbor(grid.getEntity(cellID).getLiveNeighbor() + 1);
            }
        } catch (Exception e) {
        }
        try {
            if(grid.getEntity(cellID-1).getType().equals(Entities.ALIVE)) {
                grid.getEntity(cellID).setLiveNeighbor(grid.getEntity(cellID).getLiveNeighbor() + 1);
            }
        } catch (Exception e) {
        }
        try {
            if(grid.getEntity(cellID-grid.getRows()-1).getType().equals(Entities.ALIVE)) {
                grid.getEntity(cellID).setLiveNeighbor(grid.getEntity(cellID).getLiveNeighbor() + 1);
            }
        } catch (Exception e) {
        }
        try {
            if(grid.getEntity(cellID-grid.getRows()+1).getType().equals(Entities.ALIVE)) {
                grid.getEntity(cellID).setLiveNeighbor(grid.getEntity(cellID).getLiveNeighbor() + 1);
            }
        } catch (Exception e) {
        }
        try {
            if(grid.getEntity(cellID+grid.getRows()-1).getType().equals(Entities.ALIVE)) {
                grid.getEntity(cellID).setLiveNeighbor(grid.getEntity(cellID).getLiveNeighbor() + 1);
            }
        } catch (Exception e) {
        }
        try {
            if(grid.getEntity(cellID+grid.getRows()+1).getType().equals(Entities.ALIVE)){
                grid.getEntity(cellID).setLiveNeighbor(grid.getEntity(cellID).getLiveNeighbor() + 1);
            }
        } catch (Exception e) {
        }


    }
}

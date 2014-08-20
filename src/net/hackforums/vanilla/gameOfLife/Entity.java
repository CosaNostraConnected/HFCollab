package net.hackforums.vanilla.gameOfLife;

public class Entity {

    /**
     * Entity class constructor
     * @param state The state of Entity
     * @param loc The Location of the Entity
     */
    public Entity(EntityStates state,Location loc) {
        this.state = state;
        this.location = loc;
    }

    private EntityStates state;
    private Location location;

    private int liveNeighbor = 0;

    public int getLiveNeighbor() {
        return liveNeighbor;
    }

    public void setLiveNeighbor(int liveNeighbor) {
        this.liveNeighbor = liveNeighbor;
    }

    /**
     * @return The state of the Entity
     */
    public EntityStates getState() {
        return state;
    }

    /**
     * @param state The state of the Entity
     */
    public void setState(EntityStates state) {
        this.state = state;
    }

    /**
     * @return The Location of the Entity
     */
    public Location getLocation() {
        return location;
    }

    /**
     * @param loc Location of the Entity
     */
    public void setLocation(Location loc) {
        this.location = loc;
    }
}

package net.hackforums.vanilla.gameOfLife;

public class Entity {
    /**
     * Entity class constructor
     * @param type The type of Entity
     * @param loc The Location of the Entity
     */
    public Entity(Entities type,Location loc) {
        this.type = type;
        this.location = loc;
    }

    private Entities type;
    private Location location;

    private int liveNeighbor=0;

    public int getLiveNeighbor() {
        return liveNeighbor;
    }
    public void setLiveNeighbor(int liveNeighbor) {
        this.liveNeighbor = liveNeighbor;
    }

    /**
     * @return The type of the Entity
     */
    public Entities getType() {
        return type;
    }

    /**
     * @param type The type of the Entity
     */
    public void setType(Entities type) {
        this.type = type;
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

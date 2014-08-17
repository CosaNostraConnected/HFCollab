package net.hackforums.vanilla.zombie;

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

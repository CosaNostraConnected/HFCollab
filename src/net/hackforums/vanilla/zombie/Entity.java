package net.hackforums.vanilla.zombie;

public class Entity {
    /**
     * Entity class constructor
     * @param type The type of Entity
     * @param loc The Location of the Entity
     */
    public Entity(EntityType type,Location loc) {
        this.type = type;
        this.location = loc;
    }

    private EntityType type;

    private Location location;

    /**
     * @return The type of the Entity
     */
    public EntityType getType() {
        return type;
    }

    /**
     * @param type The type of the Entity
     */
    public void setType(EntityType type) {
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

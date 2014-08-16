package com.simon987;

/**
 * Created by Simon on 2014-08-15.
 */
public class Entity {
    public Entity(Entities type,Location loc) {
        this.type = type;
        this.location = loc;
    }

    private Entities type;

    private Location location;

    public Entities getType() {
        return type;
    }

    public void setType(Entities type) {
        this.type = type;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}

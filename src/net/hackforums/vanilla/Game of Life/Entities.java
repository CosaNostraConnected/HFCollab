package com.simon987;

public enum Entities {
    DEATH,ALIVE;

    /**
     * The function toString overrides  the method in java.lang.Enum
     * @return The "icon" that will be displayed in Grid.display()
     */
    @Override
    public String toString() {
        if(super.toString() == "DEATH"){
            return "  ";
        }else{
            return "# ";
        }
    }
}
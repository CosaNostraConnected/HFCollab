package net.hackforums.vanilla.zombie;

public enum Entities {
    HUMAN,ZOMBIE,BLANK;

    /**
     * The function toString overrides  the method in java.lang.Enum
     * @return The "icon" that will be displayed in Grid.display()
     */
    @Override
    public String toString() {
        if(super.toString() == "HUMAN"){
            return "H ";
        }else if(super.toString() == "ZOMBIE"){
            return "Z ";
        }else{
            return ". ";
        }
    }
}

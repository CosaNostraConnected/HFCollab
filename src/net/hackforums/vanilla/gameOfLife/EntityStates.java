package net.hackforums.vanilla.gameOfLife;

public enum EntityStates {

    DEAD("  "),
    ALIVE("# ");

    private String textRepresentation;

    private EntityStates(String textRepresentation) {
        this.textRepresentation = textRepresentation;
    }

    public String getTextualIcon() {
        return textRepresentation;
    }
}

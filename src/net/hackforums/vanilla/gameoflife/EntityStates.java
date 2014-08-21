package net.hackforums.vanilla.gameoflife;

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

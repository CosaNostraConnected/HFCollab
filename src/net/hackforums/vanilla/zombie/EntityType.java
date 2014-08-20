package net.hackforums.vanilla.zombie;

public enum EntityType {
    HUMAN("H "),
    ZOMBIE("Z "),
    BLANK(". ");

    private String textualIcon;

    private EntityType(String textualIcon) {
        this.textualIcon = textualIcon;
    }

    public String getTextualIcon() {
        return textualIcon;
    }
}

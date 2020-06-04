package rooms;

public enum Exit {

    WEST("West"),
    EAST("East"),
    NORTH("North"),
    SOUTH("South");

    private final String value;

    Exit(String value) {
        this.value = value;
    }

    public String getExitValue() {
        return value;
    }
}

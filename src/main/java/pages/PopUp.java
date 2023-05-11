package pages;

public enum PopUp {
    SELECTSTORE ("Select store"),
    CANCEL ("Cancel"),
    GOTIT (""),
    SEETHEMENU (" ");

    private String value;

    public String value() {
        return value;
    }

    PopUp(String value) {
        this.value = value;
    }
}

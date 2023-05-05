package pages;

public enum SizeOption {
    SHORT("short"),
    TALL("tall"),
    GRANDE("grande"),
    VENTI("venti");
    private String name;

    public String value() {
        return name;
    }
    SizeOption(String name) {
        this.name = name;
    }
}
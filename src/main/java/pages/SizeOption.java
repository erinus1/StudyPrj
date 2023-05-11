package pages;

public enum SizeOption {
    SHORT("Short"),
    TALL("Tall"),
    GRANDE("Grande"),
    VENTI("Venti");
    private String name;

    public String value() {
        return name;
    }
    SizeOption(String name) {
        this.name = name;
    }
}
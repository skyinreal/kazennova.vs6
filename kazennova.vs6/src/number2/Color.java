package number2;

public enum Color {
    BLACK("черный"),
    WHITE("белый"),
    GREEN("зеленый"),
    RED("красный"),
    SEROBUROMALINOVIY("серобуромалиновый");
    private final String name;

    Color(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

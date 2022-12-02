package number2;

public enum Mark {
    JIGUL("жигуль"),
    KAMAZ("камаз"),
    AUTOVAZ("автоВАЗ"),
    BAZ("БАЗ"),
    PAZ("ПАЗ");
    private final String mark;

    Mark(String mark) {
        this.mark = mark;
    }

    public String getMark() {
        return mark;
    }
}

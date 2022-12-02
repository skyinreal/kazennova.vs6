package number1;

public enum Month {
    JANUARY(1, "Январь"),
    FEBRUARY(2,"Февраль"),
    MARCH(3,"Март"),
    APRIL(4,"Апрель"),
    MAY(5,"Май"),
    JUNE(6,"Июнь"),
    JULY(7,"Июль"),
    AUGUST(8,"Август"),
    SEPTEMBER(9,"Сентябрь"),
    OCTOBER(10,"Октябрь"),
    NOVEMBER(11,"Ноябрь"),
    DECEMBER(12,"Декабрь");

    private int num;
    private String name;

    Month(int num, String name) {
        this.num = num;
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

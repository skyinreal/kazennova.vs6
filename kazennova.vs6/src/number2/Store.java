package number2;

public enum Store {
    CAR1("ВАЗ-2101", 10,Mark.JIGUL.getMark(), 40000, Color.BLACK.getName()),
    CAR2("43255",150,Mark.KAMAZ.getMark(), 80000,Color.WHITE.getName()),
    CAR3("LADA Granta",25,Mark.AUTOVAZ.getMark(), 100,Color.RED.getName()),
    CAR4("5922", 65,Mark.BAZ.getMark(), 12000,Color.GREEN.getName()),
    CAR5("ПАЗ-2256", 10000,Mark.PAZ.getMark(), 100000000,Color.SEROBUROMALINOVIY.getName());
    private final String model;
    private final int speed;
    private final String mark;
    private final int cost;
    private final String color;

    Store(String model, int speed, String mark, int cost, String color) {
        this.model = model;
        this.speed = speed;
        this.mark = mark;
        this.cost = cost;
        this.color = color;
    }

    public int getCost() {
        return cost;
    }

    public int getSpeed() {
        return speed;
    }

    @Override
    public String toString() {
        return "model=" + model +  ", speed=" + speed + ", mark=" + mark +  ", cost=" + cost + ", color= " + color ;
    }
}

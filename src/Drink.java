public abstract class Drink {
    private String name;
    private float liters;
    private int price;

    public Drink(String name, float liters, int price) {
        this.name = name;
        this.liters = liters;
        this.price = price;
    }

    public String getInfo() {
        return "[Drink: " + name + ", " + liters + "L, Price: " + price + "tg]";
    }
}

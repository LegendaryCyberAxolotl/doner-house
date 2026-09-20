public abstract class Fries {
    private Shape shape;
    private CookType type;
    private int price;

    public Fries(Shape shape, CookType type, int price) {
        this.shape = shape;
        this.type = type;
        this.price = price;
    }

    public String getInfo() {
        return "[Shape: " + shape + ", Cooked: " + type + ", Price: " + price + "tg]";
    }
}

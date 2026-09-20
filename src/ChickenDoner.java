public class ChickenDoner implements Doner {
    private static final Type DONER_TYPE = Type.CHICKEN;
    private Bread bread;
    private Ingredients[] ingredients;
    private Sauce[] sauce;
    private int price;

    public ChickenDoner(Bread bread, Ingredients[] ingredients, Sauce[] sauce, int price) {
        this.bread = bread;
        this.ingredients = ingredients;
        this.sauce = sauce;
        this.price = price;
    }

    @Override
    public String getInfo() {
        String info = "[Type: " + '{' + ChickenDoner.DONER_TYPE + "}, Bread: " + '{' + this.bread + "}, Ingredients: " + this.ingredients + ", Sauce: " + this.sauce + ", Price: " + this.price + ']';
        return info;
    }
}

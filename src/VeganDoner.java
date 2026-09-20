public class VeganDoner implements Doner {
    private static final Type DONER_TYPE = Type.VEGAN;
    private Bread bread;
    private Ingredients[] ingredients;
    private Sauce[] sauce;
    private int price;

    public VeganDoner(Bread bread, Ingredients[] ingredients, Sauce[] sauce, int price) {
        this.bread = bread;
        this.ingredients = ingredients;
        this.sauce = sauce;
        this.price = price;
    }

    @Override
    public String getInfo() {
        String info = "[Type: " + '{' + VeganDoner.DONER_TYPE + "}, Bread: " + '{' + this.bread + "}, Ingredients: " + this.ingredients + ", Sauce: " + this.sauce + ", Price: " + this.price + ']';
        return info;
    }
}

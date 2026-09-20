import java.util.Arrays;

public class BeefDoner implements Doner {
    private static final Type DONER_TYPE = Type.BEEF;
    private Bread bread;
    private Ingredient[] ingredients;
    private Sauce[] sauce;
    private int price;

    public BeefDoner(Bread bread, Ingredient[] ingredients, Sauce[] sauce, int price) {
        this.bread = bread;
        this.ingredients = ingredients;
        this.sauce = sauce;
        this.price = price;
    }

    @Override
    public String getInfo() {
        String info = "{Type: " + DONER_TYPE + ", Bread: " + bread + ", Ingredients: " + Arrays.toString(ingredients) + ", Sauce: " + Arrays.toString(sauce) + ", Price: " + price + '}';
        return info;
    }
}

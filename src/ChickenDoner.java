import java.util.Arrays;

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
        String info = "{Type: " + DONER_TYPE + ", Bread: " + bread + ", Ingredients: " + Arrays.toString(ingredients) + ", Sauce: " + Arrays.toString(sauce) + ", Price: " + price + '}';
        return info;
    }
}

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
    public void cookDoner() {
        System.out.println("Vegan doner cooked!");
    }

    @Override
    public void sellDoner() {
        System.out.println("Vegan doner sold for " + price + "!");
    }
}

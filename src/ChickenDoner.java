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
    public void cookDoner() {
        System.out.println("Chicken doner cooked!");
    }

    @Override
    public void sellDoner() {
        System.out.println("Chicken doner sold for " + price + "!");
    }
}

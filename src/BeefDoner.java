public class BeefDoner implements Doner {
    private static final Type DONER_TYPE = Type.BEEF;
    private Bread bread;
    private Ingredients[] ingredients;
    private Sauce[] sauce;
    private int price;

    public BeefDoner(Bread bread, Ingredients[] ingredients, Sauce[] sauce, int price) {
        this.bread = bread;
        this.ingredients = ingredients;
        this.sauce = sauce;
        this.price = price;
    }

    @Override
    public void cookDoner() {
        System.out.println("Beef doner cooked!");
    }

    @Override
    public void sellDoner() {
        System.out.println("Beef doner sold for " + price + "!");
    }
}

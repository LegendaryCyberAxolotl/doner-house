public class TurkishChef {
    private static final Bread BREAD = Bread.LAVASH;

    private static final Ingredient[] INGREDIENTS = {
        Ingredient.TOMATO,
        Ingredient.ONION
    };

    private static final Sauce[] SAUCE = {
        Sauce.TOMATO,
        Sauce.KEFIR,
    };

    private static final int BEEF_PRICE = 2000;
    private static final int CHICKEN_PRICE = 1800;
    private static final int VEGAN_PRICE = 1600;

    public Doner cookDoner(Type type) {
        switch(type) {
            case BEEF:
                return new BeefDoner(BREAD, INGREDIENTS, SAUCE, BEEF_PRICE);
            case CHICKEN:
                return new ChickenDoner(BREAD, INGREDIENTS, SAUCE, CHICKEN_PRICE);
            case VEGAN:
                return new VeganDoner(BREAD, INGREDIENTS, SAUCE, VEGAN_PRICE);
            default:
                throw new IllegalArgumentException("Unsupported type: " + type);
        }
    }
}

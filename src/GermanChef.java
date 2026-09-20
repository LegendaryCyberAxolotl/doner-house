public class GermanChef {
    private static final Bread BREAD = Bread.PIDE;

    private static final Ingredient[] INGREDIENTS = {
        Ingredient.TOMATO,
        Ingredient.ONION,
        Ingredient.LETTUCE,
        Ingredient.CABBAGE,
        Ingredient.CHEESE
    };

    private static final Sauce[] SAUCE = {
        Sauce.GARLIC,
        Sauce.SPICY,
    };

    private static final int BEEF_PRICE = 2300;
    private static final int CHICKEN_PRICE = 2100;
    private static final int VEGAN_PRICE = 1900;

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

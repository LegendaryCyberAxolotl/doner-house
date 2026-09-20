public class GermanChef {
    private static final Bread BREAD = Bread.PIDE;

    private static final Ingredients[] INGREDIENTS = {
        Ingredients.TOMATO,
        Ingredients.ONION,
        Ingredients.LETTUCE,
        Ingredients.CABBAGE,
        Ingredients.CHEESE
    };

    private static final Sauce[] SAUCE = {
        Sauce.GARLIC,
        Sauce.SPICY,
    };

    public Doner cookDoner(Type type) {
        switch(type) {
            case BEEF:
                return new BeefDoner(BREAD, INGREDIENTS, SAUCE, 2300);
            case CHICKEN:
                return new ChickenDoner(BREAD, INGREDIENTS, SAUCE, 2100);
            case VEGAN:
                return new VeganDoner(BREAD, INGREDIENTS, SAUCE, 1900);
            default:
                throw new IllegalArgumentException("Unsupported type: " + type);
        }
    }
}

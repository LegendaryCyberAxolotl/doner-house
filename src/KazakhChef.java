public class KazakhChef {
    private static final Bread BREAD = Bread.LAVASH;

    private static final Ingredients[] INGREDIENTS = {
        Ingredients.TOMATO,
        Ingredients.POTATO,
        Ingredients.CUCUMBER
    };

    private static final Sauce[] SAUCE = {
        Sauce.TOMATO,
        Sauce.MAYO,
    };

    public Doner cookDoner(Type type) {
        switch(type) {
            case BEEF:
                return new BeefDoner(BREAD, INGREDIENTS, SAUCE, 2100);
            case CHICKEN:
                return new ChickenDoner(BREAD, INGREDIENTS, SAUCE, 1950);
            case VEGAN:
                return new VeganDoner(BREAD, INGREDIENTS, SAUCE, 1800);
            default:
                throw new IllegalArgumentException("Unsupported type: " + type);
        }
    }
}

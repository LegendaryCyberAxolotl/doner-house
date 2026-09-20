public class TurkishChef {
    private static final Bread BREAD = Bread.LAVASH;

    private static final Ingredients[] INGREDIENTS = {
        Ingredients.TOMATO,
        Ingredients.ONION
    };

    private static final Sauce[] SAUCE = {
        Sauce.TOMATO,
        Sauce.KEFIR,
    };

    public Doner cookDoner(Type type) {
        switch(type) {
            case BEEF:
                return new BeefDoner(BREAD, INGREDIENTS, SAUCE, 2000);
            case CHICKEN:
                return new ChickenDoner(BREAD, INGREDIENTS, SAUCE, 1800);
            case VEGAN:
                return new VeganDoner(BREAD, INGREDIENTS, SAUCE, 1600);
            default:
                throw new IllegalArgumentException("Unsupported type: " + type);
        }
    }
}

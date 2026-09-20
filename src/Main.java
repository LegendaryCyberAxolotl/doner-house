public class Main {
    public static void testTurkishCombo() {
            ComboFactory factory = new TurkishComboFactory();

            Doner doner = factory.cookDoner(Type.BEEF);
            Fries fries = factory.cookFries();
            Drink drink = factory.addDrink();

            System.out.println("--------(Turkish Combo)--------");
            System.out.println(doner.getInfo());
            System.out.println(fries.getInfo());
            System.out.println(drink.getInfo());
        }

    public static void testGermanCombo() {
            ComboFactory factory = new GermanComboFactory();

            Doner doner = factory.cookDoner(Type.CHICKEN);
            Fries fries = factory.cookFries();
            Drink drink = factory.addDrink();

            System.out.println("--------(German Combo)--------");
            System.out.println(doner.getInfo());
            System.out.println(fries.getInfo());
            System.out.println(drink.getInfo());
        }

    public static void testKazakhCombo() {
            ComboFactory factory = new KazakhComboFactory();

            Doner doner = factory.cookDoner(Type.VEGAN);
            Fries fries = factory.cookFries();
            Drink drink = factory.addDrink();

            System.out.println("--------(Kazakh Combo)--------");
            System.out.println(doner.getInfo());
            System.out.println(fries.getInfo());
            System.out.println(drink.getInfo());
        }
    public static void main(String[] args) {
        testTurkishCombo();
        testGermanCombo();
        testKazakhCombo();
    }
}

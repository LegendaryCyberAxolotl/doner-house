public class TurkishComboFactory implements ComboFactory {

    @Override
    public Doner cookDoner(Type type) {
        return new TurkishChef().cookDoner(type);
    }

    @Override
    public Fries cookFries() {
        return new SlicedFries();
    }

    @Override
    public Drink addDrink() {
        return new AiranDrink();
    }
}

public class GermanComboFactory implements ComboFactory{
    @Override
    public Doner cookDoner(Type type) {
        return new GermanChef().cookDoner(type);
    }

    @Override
    public Fries cookFries() {
        return new CurlyFries();
    }

    @Override
    public Drink addDrink() {
        return new AppleDrink();
    }
}

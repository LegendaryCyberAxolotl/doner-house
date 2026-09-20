public class KazakhComboFactory implements ComboFactory{
    @Override
    public Doner cookDoner(Type type) {
        return new KazakhChef().cookDoner(type);
    }

    @Override
    public Fries cookFries() {
        return new FrenchFries();
    }

    @Override
    public Drink addDrink() {
        return new ColaDrink();
    }
}

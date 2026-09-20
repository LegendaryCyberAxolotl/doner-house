# Clean Code Principles

## Meaningful, intention-revealing names for classes/methods/variables

**Before:**

```java
DonerCreator
createDoner()
```

**After:**

```java
DonerChef
cookDoner()
```

> These names show what these classes and methods do. Not just a raw technical names, but names that show what those mean.

## Small methods, each doing one thing

```java
@Override
public String getInfo() {
    String info = "{Type: " + DONER_TYPE + ", Bread: " + bread + ", Ingredients: " + Arrays.toString(ingredients) + ", Sauce: "+ Arrays.toString(sauce) + ", Price: " + price + '}';
    return info;
    }
```

> Methods have only one job. This method, for example, only assembles a string with data which will be printed separately.

## Consistent formatting and small, focused classes

```java
public class BeefDoner implements Doner {
    private static final Type DONER_TYPE = Type.BEEF;
    // Fields + getInfo() - no other logic
```

> Instead of a single large Doner class with a type field and complex internal logic, each type of doner is represented by a separate, small class that performs a single task: describing itself. This ensures that each class remains highly specialized and easy to understand.

## Validated construction (e.g., build() throws a clear exception on invalid state)

```java
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
```

> If a person enters an unsupported type while creating products, they will know they made an error immediately.

## No magic numbers/strings

**Before:**

```java
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
```

**After:**

```java
private static final int BEEF_PRICE = 2100;
private static final int CHICKEN_PRICE = 1950;
private static final int VEGAN_PRICE = 1800;

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
```

**What changer?**
> Now the price of a doner for each type is a field that is described in the class. It is understandable what these numbers are, unlike before when it was unclear what stands for those numbers.
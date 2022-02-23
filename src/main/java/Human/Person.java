package Human;

import Animals.Mammal;

public class Person extends Mammal {

    @Override
    protected void eats(String food) {
        super.eats(food);
    }

    public Person(String name) {
        super(name);
    }
}


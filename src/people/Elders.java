package people;

import enums.Age;

/* Respected old people class */
public class Elders extends Human {
    public Elders() {
        this.setAge(Age.OLD);
    }

    @Override
    public void see() {}
}

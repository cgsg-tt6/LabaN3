package buildings;

import enums.Age;
import enums.Shapes;
import interfaces.Condition;

public class Subway extends Building implements Condition {

    public Subway() {
        super();
    }

    public Subway(Age age, Shapes shape, String place) {
        super(age, shape, place);
    }

    @Override
    public String toString() {
        return "Subway " + super.toString();
    }

    @Override
    public void describe() {
        System.out.println(this);
    }
}

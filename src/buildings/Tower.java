package buildings;

import enums.Age;
import enums.Shapes;
import interfaces.Condition;

public class Tower extends Building implements Condition {
    public Tower() {
        super(Age.OLD, Shapes.ROUND);
    }

    public Tower(Age age, Shapes shape) {
        super(age, shape);
    }

    @Override
    public void describe() {
        String description = "Round old tower";
        if (this.getAge() != Age.OLD && this.getShape() != Shapes.ROUND)
            description = "Unusual tower";
        System.out.println(description);
    }
}

package buildings;

import enums.Age;
import enums.Shapes;

public class Building {
    private Age age;
    private Shapes shape;

    public Age getAge() {
        return age;
    }

    public void setAge(Age age) {
        this.age = age;
    }

    public void setShape(Shapes shape) {
        this.shape = shape;
    }

    public Shapes getShape() {
        return shape;
    }

    public Building() {
        age = Age.UNKNOWN;
        shape = Shapes.DEFAULT;
    }

    public Building(Age age, Shapes shape) {
        this.setAge(age);
        this.setShape(shape);
    }
}

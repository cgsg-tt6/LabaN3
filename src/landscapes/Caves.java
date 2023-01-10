package landscapes;

import buildings.Building;
import enums.Shapes;

public class Caves extends Building {
    public Caves(Shapes shape) {
        super(null, shape, null);
    }

    @Override
    public String toString() {
        return "Caves of " + this.getShape() + " shape pass by";
    }
}

package people;

import interfaces.Flying;
import objects.CrazyCliffs;

public class Author extends Human implements Flying {
    @Override
    public void fly() {
        CrazyCliffs cf = new CrazyCliffs();
        System.out.println("Author flies above "+ cf);
    }

    @Override
    public void run(boolean isFast) {}

    @Override
    public boolean equals(Object o) {
        return (this.getClass() == o.getClass() && this == o);
    }

    @Override
    public int hashCode() {
        return 1;
    }

    @Override
    public String toString() {
        return "Author is Male, he can fly";
    }

    @Override
    public void see() {
        System.out.println("Author не смотрит вверх");
    }
}

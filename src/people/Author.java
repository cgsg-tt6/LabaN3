package people;

import interfaces.Flying;
import objects.HrebtyBezumia;

public class Author extends Human implements Flying {
    @Override
    public void fly() {
        System.out.println("Author flies above "+HrebtyBezumia.hrebtybezumia());
    }

    @Override
    public void run(boolean isFast) {

    }

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

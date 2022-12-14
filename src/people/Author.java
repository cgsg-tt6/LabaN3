package subject;

public class Author extends Male implements Flying{
    @Override
    public void fly() {
        System.out.println("Author flies");
    }
    @Override
    public boolean equals(Object o) {
        if (this.getClass() == o.getClass() && this == o)
            return true;
        return false;
    }
    @Override
    public int hashCode() {
        return 1;
    }
    @Override
    public String toString() {
        return "Athor is Male, he can fly";
    }
}

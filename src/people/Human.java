package people;

import interfaces.Condition;

// класс Денфронт будет наследовать этот класс, но у него будет также имя
public abstract class Human implements Condition {

    @Override
    public String toString() {
        return "Новый Human заспавнился";
    }

    @Override
    public void describe() {
        // this.toString = this
        System.out.println(this);
    }

    public Human() {
        describe();
    }
    public abstract void see();
}

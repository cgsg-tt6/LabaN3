package people;

import objects.Book;
import interfaces.Human;
import enums.Literature;

public class Denfort extends people.Human implements Human {
    private final String name = "Denfort";

    public Denfort() {}

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return this.name +" was created";
    }

    @Override
    public void read(String reader, Book b, boolean isInProgress, Literature type){
        if (isInProgress) {
            System.out.println(reader + " is reading a " + type + " called '" + b.getBookName() + "' from '"+b.getWhereFrom()+"'");
        } else {
            System.out.println(reader + " has read " + type + " called '" + b.getBookName() + "' from '" +b.getWhereFrom()+"'");
        }
    }

    @Override
    public void say(String subjectName, String phrase, boolean isMeaningful, boolean isConfident) {
        System.out.println(subjectName+" says '" + phrase + "'; "+ "meaningfulness: "+ isMeaningful +", confidence: " + isConfident);
    }

    @Override
    public void see() {
        System.out.println("Не мог узреть он так много в одно мгновение");
    }
}

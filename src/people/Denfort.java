package people;

import objects.Book;
import interfaces.Humanish;
import enums.Literature;

public class Denfort extends Human implements Humanish {
    private final String name;

    public String getName() {
        return name;
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
        System.out.println(subjectName+" says '" + phrase + "'; "+ "осмысленность: "+ isMeaningful +", уверенность: " + isConfident);
    }

    public Denfort(){
        this.name = "Denfort";
        System.out.println(this.name +" заспавнился");
    }

    @Override
    public void see() {
        System.out.println("Не мог узреть он так много в одно мгновение");
    }
}

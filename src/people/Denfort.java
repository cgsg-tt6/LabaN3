package subject;

import java.util.LinkedList;
import java.util.List;

public class Denfort extends Male implements Humanish {
    private final String name;

    public String getName() {
        return name;
    }

    @Override
    public void read(String reader, Book b, boolean isInProgress, Literature type){
        if (isInProgress) {
            System.out.println(reader + " is reading a " + type + " called '" + b.getBookName() + "' from '"+b.getWhereFrom()+"'");
        } else {
            System.out.println(reader + " has read a " + type + " called '" + b.getBookName() + "' from '" +b.getWhereFrom()+"'");
        }
    }

    @Override
    public void say(String subjectName, String phrase, boolean isOsmyslenno, boolean isConfident) {
        System.out.println(subjectName+" says '" + phrase + "'; "+ "осмысленность: "+ isOsmyslenno +", уверенность: " + isConfident);
    }

    public Denfort(){
        this.name = "Denfort";
        System.out.println(this.name +" заспавнился");
    }
}

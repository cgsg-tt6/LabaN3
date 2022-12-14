import enums.Literature;
import people.*;
import objects.*;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("""
                Вариант 9136
                Иногда с его губ срываются бессвязные, лишенные смысла словосочетания вроде: "черная бездна", "резные края", "протошогготы",
                "пятимерные, наглухо закрытые конструкции", "мерзкий цилиндр", "древний Фарос", "Иог-Сотот", "исходная белая студнеобразная структура",
                "космический оттенок", "крылья", "глаза в темноте", "лунная дорожка", "первозданный, вечный, неумирающий" и прочие странные словосочетания.
                Придя в себя, он ничего толком не объясняет, связывая свои темные высказывания с неумеренным чтением в юные годы опасной эзотерической литературы.
                Денфорт, один из немногих, осмелился дочитать до конца источенный временем том "Некрономикона", хранившийся под замком в библиотеке университета.
                Помнится, когда мы летели над Хребтами Безумия, небо хмурилось, и хотя я ни разу не посмотрел вверх, но, думаю, клубившиеся снежные вихри принимали там фантастические очертания.
                Быстро бегущие облака могли усилить, дополнить и даже исказить картину, воображение -- с легкостью разукрасить ее еще больше,
                а к тому времени, когда Денфорт впервые заикнулся о своем кошмарном видении, оно успело также обрасти аллюзиями из его давнего чтения.
                Не мог узреть он так много в одно мгновение.
                """);

        Denfort denfort = new Denfort();
        List<String> phrases1 = Arrays.asList("черная бездна", "резные края", "протошогготы", "пятимерные, наглухо закрытые конструкции", "мерзкий цилиндр", "древний Фарос", "Иог-Сотот",
                "исходная белая студнеобразная структура", "космический оттенок", "крылья", "глаза в темноте", "лунная дорожка", "первозданный, вечный, неумирающий");

        for (var phrase : phrases1) {
            denfort.say(denfort.getName(), phrase, false, false);
        }

        Book ezlit = new Book();
        ezlit.setBookName("Эзотерическая литература");
        //ezlit.setWhereFrom(null);
        ezlit.setType(Literature.DIFFERENT_BOOKS);
        denfort.read(denfort.getName(), ezlit, false, ezlit.getType());

        Book b = new Book();
        b.setBookName("Некрономикон");
        b.setWhereFrom("библиотека университета");
        b.setType(Literature.SINGLE_BOOK);
        denfort.read(denfort.getName(), b, false, b.getType());

        Author me = new Author();
        me.fly();
        me.see();
        Sky sky = new Sky();
        sky.frown();

        Cloud cloud = new Cloud();
        cloud.fly();
        cloud.run(true);
        cloud.change();
        cloud.distort();
        Imagination im = new Imagination();
        im.supplement();

        //заикнулся
        denfort.say(denfort.getName(), "что-то о своем кошмарном видении", true, false);
        denfort.see();
    }
}

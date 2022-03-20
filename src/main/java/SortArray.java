package main.java;

import main.java.examplearray.ExampleArrays;
import main.java.examplearray.models.User;

import java.util.ArrayList;
import java.util.List;

public class SortArray {

    private static final List<User> users = ExampleArrays.getUsers();

    private static final List<String> tambov = new ArrayList<>();
    private static final List<String> moscow = new ArrayList<>();
    private static final List<String> kiev = new ArrayList<>();
    private static final List<String> tula = new ArrayList<>();

    /**
     * константы с названиями городов
     * ExampleArrays.TAMBOV, ExampleArrays.MOSCOW, ExampleArrays.KIEV, ExampleArrays.TULA
     * получение полей пользователя
     *
     * user.getId();
     * user.getName();
     * user.getAge();
     * user.getCity();
     *
     * получение название города пользователя
     * user.getCity().getName();
     *
     * */

    public static void main(String[] args) {

        

        System.out.println(ExampleArrays.TAMBOV + " / " + tambov);
        System.out.println(ExampleArrays.MOSCOW + " / " + moscow);
        System.out.println(ExampleArrays.KIEV + " / " + kiev);
        System.out.println(ExampleArrays.TULA + " / " + tula);

    }
}

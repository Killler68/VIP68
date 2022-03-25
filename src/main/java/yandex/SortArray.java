package yandex;

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
     * <p>
     * получение полей пользователя
     * user.getId();
     * user.getName();
     * user.getAge();
     * user.getCity();
     * <p>
     * получение названия города пользователя
     * user.getCity().getName();
     */

    public static void main(String[] args) {
        fillCities();
        printCities();

    }

    private static void fillCities() {

        for (User user : users) {
            switch (user.getCity().getName()) { // User класс user объект getCity вызываю City
                case ExampleArrays.TAMBOV -> tambov.add(user.getName());
                case ExampleArrays.MOSCOW -> moscow.add(user.getName());
                case ExampleArrays.KIEV -> kiev.add(user.getName());
                case ExampleArrays.TULA -> tula.add(user.getName());
            }
        }
    }

    private static void printCities() {
        System.out.println(ExampleArrays.TAMBOV + " / " + tambov);
        System.out.println(ExampleArrays.MOSCOW + " / " + moscow);
        System.out.println(ExampleArrays.KIEV + " / " + kiev);
        System.out.println(ExampleArrays.TULA + " / " + tula);
    }
}

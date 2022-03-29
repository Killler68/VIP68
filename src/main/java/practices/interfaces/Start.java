package practices.interfaces;

import practices.interfaces.*;

public class Start {
    public static void main(String[] args) {
        Boy andrey = new Boy();
        Girl katya = new Girl();

        Player unit = andrey;
        Game game = new Game();
        game.start(andrey);
        School school = new School();
        school.lesson(andrey);

    }
}

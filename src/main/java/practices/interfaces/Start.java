package practices.interfaces;

    public class Start {
        public static void main(String[] args) {
            Boy andrey = new Boy();
            Girl katya = new Girl();

            Game game = new Game();
            game.start(andrey);
            School school = new School();
            school.lesson(andrey);

        }
    }


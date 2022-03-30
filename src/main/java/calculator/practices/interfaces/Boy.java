package calculator.practices.interfaces;

public class Boy implements Player, Study {


    @Override
    public void play() {
        System.out.println("Запускает одной рукой ");
    }

    @Override
    public void read() {
        System.out.println("Читает по 3 часа в день");
    }
}

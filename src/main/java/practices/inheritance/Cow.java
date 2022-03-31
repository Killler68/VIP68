package practices.inheritance;

public class Cow extends Animal { // суперкласс Animal


    public Cow(String say, int teeth) {
        setSay(say);
        setTeeth(teeth);
    }

    void mu() {
        System.out.println(getSay() + " во все " + getTeeth() + " зубов");
    }
    }


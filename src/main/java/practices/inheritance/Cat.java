package practices.inheritance;

import practices.inheritance.Animal;

public class Cat extends Animal {

    public Cat(String say, int teeth, String wool) {
        setSay(say);
        setTeeth(teeth);
        setWool(wool);
    }
    void muy() {
        System.out.println(getSay() + " во все " + getTeeth() + " зубов" + " с красивой " + getWool() + " шерстью");
    }
}

package practices;

public class InheritanceClass {
    public static void main(String[] args) {
        Cow burenka = new Cow("muu", 28);
        System.out.println(burenka.getSay());
        System.out.println(burenka.getTeeth());
        Cat cot = new Cat("muay", 28, "черной");

        burenka.mu();
        cot.muy();


    }
}





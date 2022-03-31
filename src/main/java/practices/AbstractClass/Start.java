package practices.AbstractClass;

import practices.AbstractClass.Cat;
import practices.AbstractClass.Dog;

public class Start {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        dog.makeSound();
        cat.makeSound();
        cat.eat();
    }
}

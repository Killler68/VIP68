package practices.generics;

import java.util.ArrayList;
import java.util.List;

public class TestGenerics {
    public static void main(String[] args) {
       Generics <String> stringGenerics = new Generics<>();
        stringGenerics.setT("Hello");
       String s = stringGenerics.getT();
        System.out.println(s);

    }
}

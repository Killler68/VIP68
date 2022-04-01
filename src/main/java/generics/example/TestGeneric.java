package generics.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestGeneric {
    public static void main(String[] args) {


        GenericStorage<String, String, Integer, Integer> box = new GenericStorage<>();
        box.setItem1("Hello");
        box.setItem3(5);
        box.setItem2("World");
        box.setItem4(10);
        String a = box.getItem1();
        String b = box.getItem2();
        int c = box.getItem3();
        int d = box.getItem4();

        System.out.println(a + b + c + d);


    }

}

package practices.list;

import java.util.ArrayList;
import java.util.List;

public class TestList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(4);
        list.add(8);
        list.add(3);
        list.remove(1);

        for (int n : list) {
            System.out.println(n);

            for (Integer integer : list) {
                System.out.println(integer);
            }
        }
    }
}

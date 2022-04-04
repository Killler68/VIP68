package practices;

import java.util.HashMap;

public class Map {
    public static void main(String[] args) {
        SayHello();
    }

    public static void SayHello() {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "hello");
        map.put(2, "hey");
        map.put(3, "hi");

for (java.util.Map.Entry<Integer,String> entry: map.entrySet() )
            System.out.println(entry);

    }
}

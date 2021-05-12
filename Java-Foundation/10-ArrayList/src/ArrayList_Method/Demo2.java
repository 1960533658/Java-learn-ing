package ArrayList_Method;

import java.util.ArrayList;
import java.util.Collections;

public class Demo2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(22);
        Collections.addAll(list, 33, 44, 55);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i)); // 11 22 33, 44, 55
        }
    }
}

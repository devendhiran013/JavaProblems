package CollectionFramwork;

import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            list.add(i);

        }
        System.out.println(list);
        int key = 2, f = 1;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == key) {
                f = 0;
            }
        }
        list.addAll(list);
        list.removeAll(list);
        System.out.println(list);




        
        if (f == 0) {
            System.out.println("Found");
        } else {
            System.out.println("Not found");
        }
    }
}

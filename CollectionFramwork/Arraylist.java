package CollectionFramwork;

import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int i = 0; i < n; i++) {
            int input = s.nextInt();
            list.add(input);

        }
        System.out.println(list);
        int key = s.nextInt(), f = 1;
        for (int i = 0; i < n; i++) {
            if (list.get(i) == key) {
                f = 0;
            }
        }
        // list.addAll(list);

        // System.out.println(list);

        if (f == 0) {
            System.out.println("Found");
        } else {
            System.out.println("Not found");
        }
    }
}

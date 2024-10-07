import java.util.*;
class Equal {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int a = s.nextInt();

    int b = 0;
    for (int i = 0; i < a; i++) {

      if (i % 2 == 0) {
        for (int j = 0; j < i; j++) {
          b = i / 2;
        }
        System.out.print(b + " ");
      }

    }

  }
}
import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int c = sc.nextInt();
    int[] a = new int[c];
    int[] aa = new int[c];
    int t = 0;
    // add 3 for every black tile
    // substract 2 for every adjacency
    
    for (int i = 0; i < c; i++) {
      a[i] = sc.nextInt();
      if (a[i] == 1) {
        t += 3;
      }
    }
    for (int i = 0; i < c; i++) {
      aa[i] = sc.nextInt();
      if (aa[i] == 1) {
        t += 3;
      }
    }
    for (int i = 0; i < c - 1; i++) {
      if (a[i + 1] == a[i] && a[i] == 1) {
        t -= 2;
      }
      if (aa[i + 1] == aa[i] && aa[i] == 1) {
        t -= 2;
      }
    }
    // must satisfy i is even
    for (int i = 0; i < c; i += 2) {
      if (a[i] == 1 && a[i] == aa[i]) {
        t -= 2;
      }
    }
    System.out.println(t);
    sc.close();
  }
}
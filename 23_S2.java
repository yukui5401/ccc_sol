import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    // bypass crop of length 1 because answer is always 0
    int n = sc.nextInt();
    int[] h = new int[n];
    int[] a = new int[n];
    int max = 0;
    for (int i = 0; i < n; i++) {
      h[i] = sc.nextInt();
      a[i] = -1;
    }
    a[0] = 0;
    // work based on centre value 
    // odd lengths
    for (int c = 0; c < n; c++) {
      int s = 0;
      for (int u = 1; c + u < n && c - u >= 0; u++) {
        s += Math.abs(h[c + u] - h[c - u]);
        if (a[2 * u] == -1) {
          a[2 * u] = s;
        }
        if (s < a[2 * u]) {
          a[2 * u] = s;
        } 
      }     
    }
    // even lengths
    for (int c = 1; c < n; c++) {
      int s = 0;
      for (int u = 0; c + u < n && c - 1 - u >= 0; u++) {
        s += Math.abs(h[c + u] - h[c - 1 - u]);
        if (a[2 * u + 1] == -1) {
          a[2 * u + 1] = s;
        }
        if (s < a[2 * u + 1]) {
          a[2 * u + 1] = s;
        }
      }
    }
    for (int i : a) {
      System.out.print(i + " ");
    }
    sc.close();
  }
}
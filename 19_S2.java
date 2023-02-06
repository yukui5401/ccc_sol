import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      for (int i = 3; i < n; i += 2) {
        boolean prime = true;
        boolean prime2 = true;
        for (int j = 3; j <= Math.sqrt(i); j += 2) {
          if (i % j == 0) {
            prime = false;
            break;
          }
        }
        if (prime) {
          for (int j = 3; j <= Math.sqrt(2 * n - i); j += 2) {
            if ((2 * n - i) % j == 0) {
              prime2 = false;
              break;
            }
          }
        } else continue;
        if (prime2) {
          System.out.println(i + " " + (2 * n - i));
          break;
        }
      }
    }
    
    
    sc.close();
  }
}
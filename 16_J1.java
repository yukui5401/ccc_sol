import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	  int k = 0, count = 0;
		while (k++ < 6) {
			if (sc.next().equals("W")) count++;
		}
		if (count > 4) {
			System.out.println(1);
		} else if (count > 2) {
			System.out.println(2);
		} else if (count > 0) {
			System.out.println(3);
		} else System.out.println(-1);
		
		sc.close();
	}
}
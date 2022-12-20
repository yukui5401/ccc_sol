import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt();
		int n = sc.nextInt();
		int count = 0;
		for (int i = 1; i < 10; i++) {
			if (i <= m && (10 - i) <= n) {
				count++;
			}
		}
		if (count == 1) {
			System.out.println("There is " + count + " way to get the sum 10.");
		} else {
			System.out.println("There are " + count + " ways to get the sum 10.");
		}
		
		sc.close();
	}
}
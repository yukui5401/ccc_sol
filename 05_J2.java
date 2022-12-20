import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt(), b = sc.nextInt();
		int ans = 0;
		for (int i = a; i < b + 1; i++) {
			int count = 0;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					count++;
				}
			}
			if (count == 2) ans++;
		}
		System.out.println("The number of RSA numbers between " + a + " and " + b + " is " + ans);
		
		sc.close();
	}
}
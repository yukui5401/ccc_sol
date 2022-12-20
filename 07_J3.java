import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = n;
		int ttl = 1691600;
		while (k-- > 0) {
			int a = sc.nextInt();
			if (a == 1) {
				ttl -= 100;
			} else if (a == 2) {
				ttl -= 500;
			} else if (a == 3) {
				ttl -= 1000;
			} else if (a == 4) {
				ttl -= 5000;
			} else if (a == 5) {
				ttl -= 10000;
			} else if (a == 6) {
				ttl -= 25000;
			} else if (a == 7) {
				ttl -= 50000;
			} else if (a == 8) {
				ttl -= 100000;
			} else if (a == 9) {
				ttl -= 500000;
			} else {
				ttl -= 1000000;
			}
		}
		int b = sc.nextInt();
		if (ttl / (10 - n) < b) {
			System.out.println("deal");
		} else {
			System.out.println("no deal");
		}
	
		sc.close();
	}
}
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt();
		int n = sc.nextInt();
		int k = sc.nextInt();
		boolean[] row = new boolean[m];
		boolean[] col = new boolean[n];	
		
		for (int i = 0; i < k; i++) {
			String x = sc.next();
			int l = sc.nextInt();
			if (x.equals("R")) {
				row[l - 1] = !row[l - 1];
			} else {
				col[l - 1] = !col[l - 1];
			}
		}
		
		int q = 0, r = 0;
		for (boolean i : row) {
			if (i) {
				q++;
			}
		}
		for (boolean i : col) {
			if (i) {
				r++;
			}
		}

		System.out.println(n * q + m * r - 2 * q * r);
		sc.close();
	}
}
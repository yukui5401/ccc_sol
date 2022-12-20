import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(), m = sc.nextInt();
		String[] adj = new String[n];
		String[] noun = new String[m];
		for (int i = 0; i < n; i++) {
			adj[i] = sc.next() + " as ";
		}
		for (int i = 0; i < m; i++) {
			noun[i] = sc.next();
		}
		for (String e : adj) {
			for (String f : noun) {
				System.out.println(e + f);
			}
		}
		
		
		sc.close();
	}
}
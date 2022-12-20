import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = (int) Math.sqrt(n);
		System.out.println("The largest square has side length " + k + ".");
		
		sc.close();
	}
}
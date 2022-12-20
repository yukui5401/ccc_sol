import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		while (x <= y) {
			System.out.println("All positions change in year " + x);
			x += 60;
		}
	
		sc.close();
	}
}
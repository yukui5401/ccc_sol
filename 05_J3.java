import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> dir = new ArrayList<String>();
		ArrayList<String> loc = new ArrayList<String>();
		int i = 0;
		
		while (true) {
			dir.add(sc.next());
			loc.add(sc.next());
			if (loc.get(i).equals("SCHOOL")) {
				break;
			}
			i++;
		}
		
		for (int j = dir.size() - 1; j >= 0; j--) {
			String d;
			if (dir.get(j).equals("R")) {
				d = "LEFT";
			} else {
				d = "RIGHT";
			}
			if (j > 0) {
				System.out.println("Turn " + d + " onto " + loc.get(j - 1) + " street.");
			} else {
				System.out.println("Turn " + d + " into your HOME.");
			}
		} 
		
		sc.close();
	}
}
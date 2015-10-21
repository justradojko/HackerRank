import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		int d, p, q;
		scanner.nextLine();
		
		ArrayList<ArrayList<Integer>> array = new ArrayList<ArrayList<Integer>>(n);
		
		for (int i = 0; i < n; i++) {
			d = scanner.nextInt();
			
			array.add(new ArrayList<Integer>(d));
			
			for (int j = 0; j < d; j++) {
				array.get(i).add(scanner.nextInt());
			}
			scanner.nextLine();
		}
		
		n = scanner.nextInt();
		scanner.nextLine();
		
		for (int i = 0; i < n; i++) {
			p = scanner.nextInt();
			q = scanner.nextInt();
			scanner.nextLine();
			
			if( array.get(p - 1).size() < q)
				System.out.println("ERROR!");
			else 
				System.out.println(array.get(p - 1).get(q - 1));
		}
		scanner.close();
	}
}

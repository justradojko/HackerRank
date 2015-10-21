import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Solution {

	public static void main(String[] args) {
		Set<NamePairs> nameSet = new HashSet<NamePairs>();
		
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		scanner.nextLine();
		String namePair;
		
		for (int i = 0; i < n; i++) {
			namePair = scanner.nextLine();
			if (namePair.contains(" ")) {
				nameSet.add(new NamePairs(namePair.split(" ")[0], namePair.split(" ")[1]));
			}
			System.out.println(nameSet.size());
		}
	}
}

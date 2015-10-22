import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		
		Character space = ' ';
		Character hashtag = '#';
		
		
		String spaceString = "";
		String hashtagString = "";
		
		for (int i = 0; i < n; i++) {
			spaceString += space; 
		}
		
		for (int i = 0; i < n; i++) {
			hashtagString += hashtag;
			spaceString = spaceString.substring(0, spaceString.length() - 1 );
			System.out.println(spaceString + "" + hashtagString);
		}
	}
}

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
	private ArrayList<Character> stringElements;
	
	private void loadDataAndAnalize(String string){
		stringElements = new ArrayList<Character>();
		
		for (int i = 0; i < string.length(); i++) {
			stringElements.add(string.charAt(i));
		}
	}
	
	private boolean analize(){
		int size = stringElements.size();
		if(size == 0){
//			System.out.println("String is empty");
			return true;
		}
		
		if(size % 2 == 1){
//			System.out.println("There is uneven number of parentheses");
			return false;
		}
		
		int numberOfClosedParentheses = 0;
		Character chr;
		
		for (int i = 1; i < stringElements.size(); i++) {
			if(i == 0) i = 1;
			chr = stringElements.get(i);
			if(  (chr == ')') || (chr == ']') || (chr == '}')){
				
				if(checkParentheses(stringElements.get(i-1), chr)){
					stringElements.remove(i);
					stringElements.remove(i-1);
					i -= 2;
					numberOfClosedParentheses++;
				} else{
//					System.out.println("Wrong close parentheses: " + chr + ":" + stringElements.get(i-1));
					return false;
				}
			}		
		}
		
		if(numberOfClosedParentheses == (size / 2))
			return true;
		else {
			return false;
		}
	}
	
	private boolean checkParentheses(Character c1, Character c2){
		if((c1 == '(') && (c2== ')')){
			return true;
		}
		if((c1 == '[') && (c2== ']')){
			return true;
		}
		if((c1 == '{') && (c2== '}')){
			return true;
		}
		return false;
	}
	
	public void go(String string){
		this.loadDataAndAnalize(string);
		System.out.println(this.analize());
	}
	
	public static void main(String []argh){
		Solution solution = new Solution();
		
		Scanner sc = new Scanner(System.in);
	      
	    while (sc.hasNext()) {
	        String input=sc.next();
	        solution.go(input);
	    }

		
	}
}

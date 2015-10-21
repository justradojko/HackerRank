import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Solution {
	private Stack<Character> stack = new Stack<Character>();
	
	private void emptyStack(){
		while (!stack.empty()) {
			stack.pop();			
		}
	}
	
	private boolean analize(String string){
		emptyStack();
		
		Character chr;
		for (int i = 0; i < string.length(); i++) {
			chr = string.charAt(i);
			if(  (chr == '(') || (chr == '[') || (chr == '{')){
				stack.push(chr);
			} else if(  (chr == ')') || (chr == ']') || (chr == '}')){
				if (stack.empty()){
					return false;
				} else {
					if ( checkParentheses(stack.peek(), chr)){
						stack.pop();
					} else 
						return false;
				}
			}
		}
		if(stack.empty())
			return true;
		else 
			return false;
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
		System.out.println(this.analize(string));
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

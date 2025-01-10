package validParanthesis;
import java.util.*;

public class Solution {
	public boolean isValid(String s) {
		Stack<Character> checker = new Stack<>();
		
		for(char c : s.toCharArray()) {
			if(c == '(' || c == '{' || c == '[') {
				checker.push(c);
			}
			else if(c == ')' || c == '}' || c == ']') {
				if(checker.isEmpty()) {
					return false;
				}
				char top = checker.pop();
				if ((c == ')' && top != '(') || (c == '}' && top != '{') || (c == ']' && top != '[')) {
					return false;
				}
			}
		}
		return checker.isEmpty();
	}
}

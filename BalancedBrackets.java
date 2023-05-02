// Java program for checking
// balanced brackets
import java.util.*;

public class BalancedBrackets {

	// function to check if brackets are balanced
static boolean areBracketsBalanced(String cad){
	Deque<Character> stack	=	new	ArrayDeque<Character>();
	
	for(int i = 0; i < cad.length(); i++){
		char	c = cad.charAt(i);
		if(c == '{' || c == '[' || c == '('){
			stack.push(c);
			continue;
		}
		if(stack.isEmpty()) return false;
		char cc;
		switch(c){
			case ']':
					if(stack.pop() != '[' ) return false;
					break;
			case '}':
					if(stack.pop() != '{' ) return false;
					break;
			case ')':
					if(stack.pop() != '(' ) return false;
					break;
			default : return false;
		}
		
	
	}
	return stack.isEmpty();



}


	// Driver code
	public static void main(String[] args)
	{
		String expr = "{[](()}";

		// Function call
		if (areBracketsBalanced(expr))
			System.out.println("Balanced ");
		else
			System.out.println("Not Balanced ");
	}
	

}

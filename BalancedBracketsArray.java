// Java program for checking
// balanced brackets
import java.util.*;

public class BalancedBracketsArray {

	// function to check if brackets are balanced
static public boolean areBracketsBalanced(String cad){
	int index =  0;
	char[] stack	=	new	char[cad.length()];
	
	for(int	i	=	0;	i	<	cad.length();	i++){
		char	c	=	cad.charAt(i);
		if(c == '[' || c == '{' ||	c == '('){
			stack[index] = c;
			index++;
			continue;
		}
		if(index == 0)	return false;
		char cc;
		switch(c){
			case	']':	
				index--;
				cc	=	stack[index];
				if(cc != '[')	return false;
				break;
			case	'}':		
				index--;
				cc	=	stack[index];
				if(cc != '{')	return false;
				break;
			case	')':	
				index--;
				cc	=	stack[index];
				if(cc != '(')	return false;
				break;		
			default: return false;
		
		}
	}
	return index == 0;
}


	// Driver code
	public static void main(String[] args)
	{
		String expr = "([{[}])";

		// Function call
		if (areBracketsBalanced(expr))
			System.out.println("Balanced ");
		else
			System.out.println("Not Balanced ");
	}
	

}

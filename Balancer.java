
import java.util.*;
public class Balancer{
	
	
	static boolean balancing(String cad){
		Deque<Character>	stack	=	new	ArrayDeque<Character>();
		
		for(int i = 0; i < cad.length(); i++){
			char	c	=	cad.charAt(i);
			if(c == '[' || c == '(' || c == '{' ){
				stack.push(c);
				continue;
			}
			if(stack.isEmpty()) return false;
			
			char cc;
			switch(c){
				case ']':	
						cc = stack.pop();
						if(cc != '[')	return false;
						break;
				case '}':	
						cc = stack.pop();
						if(cc != '{')	return false;
						break;
				case ')':	
						cc = stack.pop();
						if(cc != '(')	return false;
						break;		
				default:	return false;
				
			}
			 
			
		
		}
		return stack.isEmpty();
			
	}
	
	
	public static void main(String[] args){
		System.out.println("Is it balanced: "+ balancing(""));
	
	}
}
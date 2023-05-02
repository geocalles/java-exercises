import java.lang.*;

public class BracketsBalancer{



static boolean comparing(String express, StringBuffer process, int i, int size){
	if(i == size){
		if(process.length() == 0)  return true;
		else  return false;
	}
	char c = express.charAt(i);
	if(c == ']'){
		if('[' == process.charAt(process.length()-1)){			
			process.deleteCharAt(process.length()-1);
			comparing(express, process, i++, size);
		}else{
			return false;
		}
	}
	if(c == '}'){
		if('{' == process.charAt(process.length()-1)){			
			process.deleteCharAt(process.length()-1);
			comparing(express, process, i++, size);
		}else{
			return false;
		}
	}
	if(c == ')'){
		if('(' == process.charAt(process.length()-1)){			
			process.deleteCharAt(process.length()-1);
			comparing(express, process, i++, size);
		}else{
			return false;
		}
	}
	process.append(c);
	comparing(express, process, i++, size);
	return false;

}

	// Driver code
	public static void main(String[] args){
		String express = "([}])";
		StringBuffer sbf = new StringBuffer("");
		// Function call
		if (comparing(express, sbf, 0, express.length()))
			System.out.println("Balanced ");
		else
			System.out.println("Not Balanced ");
	}
	

}
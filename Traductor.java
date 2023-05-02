
import java.util.*;

public class Traductor {

static String translator(String word){
	String vowels = "aeiou";
	int	index = -1;
	for(int i = 0; i < vowels.length(); i++){
		if(word.indexOf(vowels.charAt(i)) > -1  && (index == -1 || word.indexOf(vowels.charAt(i)) < index) ){
			index =  word.indexOf(vowels.charAt(i));
		}
	}
	if(index >= 0){
		return word.substring(index, word.length()) + "-" + word.substring(0, index) + "ay";
	}else{
		return "";
	}
	

}


	// Driver code
	public static void main(String[] args)
	{

			System.out.println(translator("pig"));
	}
	

}

//import java.lang.*;

public class Palindrome{

	static boolean isPalindromeWord(String	word){
		StringBuilder wordCopy	= new	StringBuilder(word);
		String	reversed	=	wordCopy.reverse().toString();
		System.out.println("\n" + word + " - "+ reversed  + "  \n");
		return word.equals(reversed);
	}


	public static void main(String[] args){
		if(isPalindromeWord("APODPA")){
			System.out.println("\nPalindrome...");
		}else{
			System.out.println("\nIt is not a palindrome word...");
		}

	}


}
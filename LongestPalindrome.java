import java.util.stream.IntStream;

public class LongestPalindrome{

    static boolean isPalindromeWord(String	subWord){
        StringBuilder wordCopy	= new	StringBuilder(subWord);
        return subWord.equals(wordCopy.reverse());
    }

    static Integer getIndexOfLongestWord(StringBuilder word) {
        return IntStream.range(0, word.length())
                .boxed()
                .filter(i -> isPalindromeWord(word.toString().substring(i)))
                .findFirst()
                .get();
    }


    public static void main(String[] args){
        String	word = "atardrata";

        StringBuilder wordCopy	= new	StringBuilder(word);

        StringBuilder backwardWord	= wordCopy.reverse();

        Integer indexOrder = getIndexOfLongestWord(wordCopy);

        Integer indexBackward = getIndexOfLongestWord(backwardWord);

        String longestPalindrome = indexOrder < indexBackward ? wordCopy.toString().substring(indexOrder) : backwardWord.toString().substring(indexBackward);

        System.out.println("\nPalindrome: " + longestPalindrome);


    }


}
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

 public class RegexTest{
	 
	 
	public static void main(String[] srgs){ 
	Pattern	pattern	=	Pattern.compile("(\\d\\d){3}");
	String[] inputs = {"ola del mar", "s", "hesre", "c", "GG AGAG", "12121212", "cross", "ssssss"};
	
	Arrays.stream(inputs)
	.map(text -> pattern.matcher(text).find())
	.forEach(text -> System.out.println(text));
	
	}
 }
 /*
 static int	findMatches(String regex, String text){
	Pattern	pattern	=	Pattern.compile(regex);
	Matchet matcher = 	pattern.matcher(text);
	int matches	=	0;
	while(matcher.find()){
		matches++;
	}
	return matches;
	
 }
*/


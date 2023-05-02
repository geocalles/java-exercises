public class Factorial{

 static int numberFactoria(int fact){
		return fact > 0 ?  fact * numberFactoria(fact-1)  : 1;
 }

 public static void main(String[] arg){
	System.out.println(numberFactoria(3));
 }
}
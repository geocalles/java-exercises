public class Fibonacci{

	static int	numberFibonacci(int num){
		if(num == 0) return 0;
		if(num == 1) return 1;
		return numberFibonacci(num-2) + numberFibonacci(num-1);
		
		
	}

	 public static void main(String[] arg){
		System.out.println(numberFibonacci(3));
	 }



}



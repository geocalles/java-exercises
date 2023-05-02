import java.lang.*;

public class PowerOf3{



static boolean powerOfThree(int n){
	if(n	==	1)	return true; //n elevado a 0 es igual a 1
	int potencia	=	3;
	while(potencia <= n){
		if(potencia	==	n){	
			//System.out.println("paso aca "+ potencia);
			return true;
		}else
			potencia	=	potencia * 3;
	}
	return false;

}

	// Driver code
	public static void main(String[] args){
			
			System.out.println("Is power of 3? " + powerOfThree(27));
	}
	

}
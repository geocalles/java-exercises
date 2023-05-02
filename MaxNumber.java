import java.util.stream.IntStream;
import java.util.*;

public class MaxNumber{
	public static void main(String[] args){
	 int[] A = {3,3,2,4,1};

	/*IntStream.range(0, A.length)
	  .boxed()
	  .reduce((a,b)->A[a]<A[b]? b: a)
	  .ifPresent(i->System.out.println("Index "+ i));*/
	  
	    int max = Arrays.stream(A).max().getAsInt();

        int indexMax = IntStream.range(0, A.length)
                        .boxed()
                        .reduce((i,j) -> A[i] < A[j] ? j : i  )
                        .get();
		System.out.println("Index " + indexMax);
        for(int i = 0 ; i < indexMax; i++){
            A[i+1] += A[i]/2;
        }
        for(int i = A.length -1; i > indexMax; i--){
            A[i-1] += A[i]/2;
        }
		System.out.println("MaxSuma " + A[indexMax]);
	}
}
WEATHER_INFORMATION


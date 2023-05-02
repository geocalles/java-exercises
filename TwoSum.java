public class TwoSum{

static int[] operating(int[] numbers, int target){
	if(numbers == null || numbers.length < 2) return null;
	int[] outPut	=	new int[2];
	for(int i = 0 ; i < numbers.length - 1; i++){
		outPut[0] = i;
		for(int j = i +1 ; j < numbers.length; j++ ){
			if(numbers[i] + numbers[j] == target){
				outPut[1] = j;
				return outPut;
			}
		}
	
	}
	return null;


}

public static void main(String[] args){
	int[] twoIndex = operating(new int[]{1}, 3);
	if(twoIndex == null){
		System.out.println("Sorry, operating is allowed with two or more index and one target ");
	}else{
		System.out.println("Find Two Sum: " + twoIndex[0] + "  " + twoIndex[1] );
	}
	
}



}
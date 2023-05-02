import java.util.*;

public	class	RemoveDuplicateFromList{



	/*public static int[] deleteDuplicated(int[] myNum){
		int[] cleanArray = null;
		if(myNum != null && myNum.length > 0 ){
			cleanArray = new int[ myNum.length];
		
			int index = 1 ;
			cleanArray[0] = myNum[0];
			for(int i = 1 ; i < myNum.length ; i++){
				if(!contains(cleanArray, myNum[i])){
					cleanArray[index] = myNum[i];
					index++;
				}
				
			}
		}

		return cleanArray;
		
	}*/


	List<Integer> listWithoutDuplicates = listWithDuplicates.stream()
     .distinct()
     .collect(Collectors.toList());

	/*public static boolean contains(int[] arr, int key) {
		return Arrays.stream(arr).anyMatch(i -> i == key);
		
	}*/








public static void main(String[] args){
	int[] myNum = {0};
	for(int i :	deleteDuplicated(myNum)){
			System.out.println("# " + i);
		
	}
	
	
	
	
}



}
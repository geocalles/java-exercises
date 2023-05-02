

public class SwapInteger{

static int[] swapTwoInteger(int x, int y){
	int[] values = new int[2]; // two positions x and y
	// x = 2 and y = 3
	x = x + y;
	y = x - y;
	x = x - y;
	values[0] = x;
	values[1] = y;
	
	return values;
	
	
}

public static void main(String[] args){
	int x = 2, y = 3;
	int[] values = new int[2];
	System.out.println("Values x: " + x +"   y: "+ y);
	values = swapTwoInteger(x,y);
	System.out.println("Values x: " + values[0] +"   y: "+ values[1]);
	
	
	
}

}
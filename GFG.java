import java.util.Arrays;
 
class GFG
{
 
    // Return minumum distance required so that
    // aleast k point lie inside the circle.
    static int minRadius(int k, int[] x, int[] y,
                                          int n)
    {
        int[] dis=new int[n];
     
        // Finding distance between of each
        // point from origin
        for (int i = 0; i < n; i++)
            dis[i] = x[i] * x[i] + y[i] * y[i];
     
        // Sorting the distance
        Arrays.sort(dis);
		 System.out.println("first position: " +dis[0]);
        return dis[k - 1];
    }
 
    // Driven Program
    public static void main (String[] args) {
         
    int k = 5;
    int[] x = { 1, -1, 1, 2, 4 };
    int[] y = { 1, -1, -1, 3, 5 };
    int n = x.length;
     
    System.out.println(minRadius(k, x, y, n));
 
    }
}
import java.util.Scanner;
// Movie Hype
// http://codechef.com/viewsolution/1224253436
public class MovieHype {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        while(t-- !=0){
            int n = sc.nextInt();
            int[] arr = new int[2 * n + 1];
            
            for(int i = 0 ; i < arr.length ; i=i+2){
                arr[i] = sc.nextInt();
                if(i+1 < arr.length){
                    arr[i+1] = 0 ;
                }
            }
            
            int min = Integer.MAX_VALUE ;
            
            // int max = Integer.MIN_VALUE ;
            
            for(int i = 1 ; i < arr.length ; i=i+2){
                // max = max1(max, arr[i - 1] , arr[i+1] );
                int louu = Math.max(arr[i - 1] , arr[i+1]);
                min = Math.min(min , louu );    
            }
            
            System.out.println(min);
        }
    }
}

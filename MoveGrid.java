import java.util.*;

public class MoveGrid {

    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		
		int B = sc.nextInt();
		
		int C = sc.nextInt();
		
		int D = sc.nextInt();

        int x1 = A - C ;
        
        int y1 = B - D ;
        
        System.out.println(x1+" "+y1);
}
    
}


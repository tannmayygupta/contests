import java.util.Scanner;

public class AllZero {

    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t--!=0){
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    int c = sc.nextInt();
		    
		    if(b == (2*a + c/3) && c%3 == 0){
		        System.out.println("Yes");
		    }else{
		        System.out.println("No");
		    }
		}

	}
}
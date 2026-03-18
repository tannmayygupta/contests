import java.util.Scanner;

public class EqualBuying {

    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = n / 2 ;
        if(n % 3 == 0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
  
        }
	}
    
}
import java.util.Scanner;

public class TwoPileGame {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        while(t-- !=0){
            int x = sc.nextInt();
            int y = sc.nextInt();
            
            if(y % 2 != 0){
                if((x + y) % 2 == 0 ){
                    System.out.println("Alice");
                }else{
                    System.out.println("Bob");
                }
            }else{
                if((x + y) % 2 == 0 ){
                    System.out.println("Bob");
                    // System.out.println("Alice");
                }else{
                    System.out.println("Alice");
                }
            }
        }
	}
}

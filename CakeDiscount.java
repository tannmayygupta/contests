import java.util.Scanner;
// Cake
// // https://www.codechef.com/START233C/problems/MOVIE7 Discount
public class CakeDiscount {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		if(t < 5){
		    System.out.println(t*100);
		}else{
		    System.out.println(t*85);
		}

	}
}

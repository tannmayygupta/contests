import java.util.Scanner;

public class TestMatchTarget {
    // https://www.codechef.com/problems/TESTTGT
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc = new Scanner(System.in);
        
        int fstin = sc.nextInt();
        int secin = sc.nextInt();
        int thirin = sc.nextInt();
        
        int winrun = fstin + thirin - secin ;
        
        if(winrun < 0){
            System.out.println("0");
        }else{
            System.out.println(winrun + 1);
        }
	}
}

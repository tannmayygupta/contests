import java.util.Scanner;
// https://www.codechef.com/START231D/problems/SSNK?tab=statement
// Snaky Strings
public class SnakyStrings {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		
		if(s.charAt(0) == 's' || s.charAt(3) == 's'){
		    System.out.println("Yes");
		}else{
		    System.out.println("No");
		}

	}

}

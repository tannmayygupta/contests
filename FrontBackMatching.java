import java.util.Scanner;

public class FrontBackMatching {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        while(t-- !=0){
            int n = sc.nextInt();
            
            String s = sc.next();
            
            int[] freq = new int[26];
            
            for(int i = 0 ; i < n ; i++){
                char ch = s.charAt(i);
                
                int c = ch - 'a';
                
                freq[c]++;
            }
            
            int flag = 0 ;
            
            for(int i = 0 ; i < 26 ; i++){
                if(freq[i] > 0 && freq[i] % 2 == 0){
                    System.out.println("YES");
                    flag = 1 ;
                    break;
                }  
            }
            
            if(flag == 0){
                System.out.println("NO");
            }
        }
	}
}

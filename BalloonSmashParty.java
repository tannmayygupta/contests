import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
// Balloon Smash Party
// https://www.codechef.com/problems/BOP3E
public class BalloonSmashParty {

    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        
        int t = Integer.parseInt(b.readLine().trim());
        
        StringBuilder sb = new StringBuilder();
        
        while(t--!=0){
            
            int n = Integer.parseInt(b.readLine().trim());
            StringTokenizer s = new StringTokenizer(b.readLine());
        
            int[] a = new int[n];
            
            for(int i = 0 ; i < n ; i++){
                a[i] = Integer.parseInt(s.nextToken());
            }
            
            int thro = 0 ;
            for(int j = 0 ; j < n ; j++){
                if(thro >= a[j]){
                    sb.append(a[j]);
                }else{
                    sb.append(thro);
                    thro++;
                }
                sb.append(j == n - 1 ? "\n" : " ");
            }
        }
        System.out.print(sb);
	}

}
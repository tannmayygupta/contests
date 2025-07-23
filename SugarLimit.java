import java.util.Scanner;

public class SugarLimit {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
        
        while(t--!=0){
            int N = sc.nextInt();
            int[] a1 = new int[N];
            int[] b1 = new int[N];
            
            for(int i = 0 ; i < N;i++){
                a1[i]=sc.nextInt();
            }
            
            
            for(int i = 0 ; i < N;i++){
                b1[i]=sc.nextInt();
            }
            
            int maxtaste = Integer.MIN_VALUE  ;
            
            for(int l = 0 ; l <= 100 ; l++){
                int taste = 0 ;
                for(int i = 0 ; i < N ; i++){
                    if(b1[i] <= l && a1[i] > 0){
                        taste += a1[i];
                    }
                }
                int s1 = taste - l ;
                maxtaste = Math.max(maxtaste,s1);
            }
            
            System.out.println(maxtaste);
        }
    }
}

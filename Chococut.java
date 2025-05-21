import java.util.*;

public class Chococut{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t!=0){
		    
		    int N = sc.nextInt();
		    int M = sc.nextInt();
		    int K = sc.nextInt();
		    
		    if(K == 0){
		        System.out.println(N*M);
		    }
		    else{
		        int arv = vertical(N,M,K);
		        int arh = horizon(N,M,K);
		        
		        System.out.println(Math.max(arv,arh));
		    }
			
		    
		    t--;
		}
        
    }

    public static int horizon(int N ,int M,int K){
	        int tarea = N * M ;
	        int areah = 0;	 
            
            if(K >= tarea){
                return 0 ;
            }
	        
	        for(int i = 0 ; i < M ; i++){
	            int tp = i * N ;
	            int btm = (M - i) * N ;
	            
	            int sm = Math.min(tp,btm);
	            
	            if(sm >= K){
	                int alicekepass = tarea - sm ;
	                areah = Math.max(alicekepass,areah);
	            }
	        }
	        
	        if (tarea >= K) {
                areah = Math.max(areah, 0);
            }
	        
	        
	        return areah ;
		}
		
	public static int vertical(int N ,int M, int K){
		    int toarea = N * M ;
	        int areav = 0;	   
            
            if(K >= toarea){
                return 0 ;
            }
	        
	        for(int i = 0 ; i < N ;i++){
	            int lf = i * M ;
	            int rg = (N - i) * M ;
	            
	            int smv = Math.min(lf,rg);
	            
	            if(smv >= K){
	                int alicekepassv = toarea - smv ;
	                areav = Math.max(alicekepassv,areav);
	            }
	        }
	        
	        if (toarea >= K) {
                areav = Math.max(areav, 0);
            }
	        
	        return areav ;
		}

}

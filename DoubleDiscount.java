import java.util.Scanner;

public class DoubleDiscount {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t--!=0){
		    int n = sc.nextInt();
		    int k = sc.nextInt();
		    
		    int[] a = new int[n];
		    int[] b = new int[n];
		    
		    for(int i = 0 ; i < n ; i++){
		        a[i] = sc.nextInt();
		    }
		    
		    for(int i = 0 ; i < n ; i++){
		        b[i] = sc.nextInt();
		    }
		    
		    int[][] map = new int[n][2];
		    
		    for(int i = 0 ; i < n ; i++){
		        int cos = a[i];
		        int tss = b[i];
		        
		        map[i][0] = cos ;
		        map[i][1] = tss ;
		    }
		    
		  //  Arrays.sort(map, (a1, b1) -> Integer.compare(a1[1], b1[1]));
		    
		  //  System.out.println(Arrays.deepToString(map));
		  
		  int maxtaste = Integer.MIN_VALUE ;
		  
		  for(int j = 0 ; j < n ; j++){
		      for(int i = j+1 ; i < n ; i++){
		          
		      int o1c = map[j][0];
		      int o1t = map[j][1];
		      int o2c = map[i][0];
		      int o2t = map[i][1];
		      
		      int costly = Math.max(o1c, o2c);
              int burdi = Math.min(o1c, o2c);
		      
		      int o1c50 = costly / 2 ;
		      int o1c100 = costly - 100 ;
		      
		      int cost = o1c50 ;
		      
		      if(o1c100 > 0){
		          cost = Math.max(o1c50, o1c100);
		      }else{
		          cost = o1c50 ;
		      }
		      
		      int tcost = cost + burdi ;
		      
		      if(tcost <= k){
		          maxtaste = Math.max(maxtaste, o2t + o1t);
		      }
		  }
		}
		  
		  if(maxtaste == Integer.MIN_VALUE){
		      System.out.println(0);
		  }else{
		      System.out.println(maxtaste);
		  }
		   
		}

	}
}

import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Scanner;

public class WECREC {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t--!=0){
		    int n = sc.nextInt();
		    int x = sc.nextInt();
		    int k = sc.nextInt();
		    
		    int[] arr = new int[n];
		    for(int i = 0 ; i < n ; i++){
		        arr[i] = sc.nextInt();
		    }
		
		    int max = Integer.MIN_VALUE ;
		    HashMap<Integer, Integer> map = new HashMap<>();
		    
		    PriorityQueue<Integer> heap = new PriorityQueue<>((a,b) -> b - a);
		    HashSet<Integer> set = new HashSet<>();
		    for(int i = 0 ; i < n ; i++){
		        int num = arr[i];
		        if(map.containsKey(num)){
		            int val = map.get(num);
		            map.put(num,val+1);
		        }else{
		            map.put(num,1);
		        }
		        if(!set.contains(num)){
		            heap.add(num);
		            set.add(num);
		        }
		    }
		    int ans = 0 ;
		    
		    while(k--!=0 && !heap.isEmpty()){
		        int num = heap.poll();
		        int val = map.get(num);
		        ans+= val ;
		    }
		    
		    if(ans >= x){
		        System.out.println(x);
		    }else{
		        System.out.println(ans);
		    }
		    
		}
		

	}
}

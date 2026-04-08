import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class KMedian {
    public static void main(String[] args) {
        // // your code goes here
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t--!=0){
		    int n = sc.nextInt();
		    int k = sc.nextInt();
		    
		    ArrayList<Integer> arr = new ArrayList<>();
		    
		    for(int i = 0 ; i < n ; i++){
		        arr.add(sc.nextInt());
		    }
		    
		    Collections.sort(arr);
		    
		    int l1 = k ;
		    int end1 = n - 1 ;
		    // 1 2 3 4
		    int mid1 = (l1 + end1) / 2 ;
		    
		    int l2 = 0 ;
		    int end2 = n - 1 - k ;
		    // 1 2 3 4
		    int mid2 = (l2 + end2) / 2 ;
		    
		    
		    ArrayList<Integer> ans = new ArrayList<>();
		    
		    for(int i = mid2 ; i <= mid1 ; i++){
		        if(!ans.contains(arr.get(i))){
		            ans.add(arr.get(i));
		        }
		    }
		    
		    for(int i = 0 ; i < ans.size(); i++){
		        System.out.print(ans.get(i)+" ");
		    }
		    
		    
		    System.out.println();
		    
		}
    }
}

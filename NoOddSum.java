import java.util.Arrays;
import java.util.Scanner;

public class NoOddSum {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t!=0){
		    
		    int n = sc.nextInt();
		    
		    int[] arr = new int[n];
		    
            for(int i = 0 ; i < n ; i++){
                arr[i] = sc.nextInt();
            }

            int count1 = 0 ;

            int count2 = 0 ;

            Arrays.sort(arr);


            for(int i = 0 ; i < n ; i++){
                if(arr[i] == 1){
                    count1++;
                }
                else if(arr[i] == 2){
                    count2++;
                }
            }

            // if(count1 > 0 && count2 == 0){
            //     System.out.println(0);
            // }

            // else if(count2 > 0 && count1 == 0){
            //     System.out.println(0);
            // }
            // else if(count1 > 0 && count1 % 2 != 0){
            //     if (count2 > 0) {
            //         System.out.println(count2);
            //     }
            // }
            // else if(count1 % 2 != 0 && count1 > 2 ){
            //     System.out.println(count2);
            // }
            // else if(count1 >= 2 && count1 % 2 == 0){
                
            // }

            int option1 = Integer.MAX_VALUE;
            
            int option2 = Integer.MAX_VALUE;

            option1 = count2;

            
            if(count1 % 2 == 0) {
                option2 = count1 / 2;
            }

            System.out.println(Math.min(option1, option2));

		    t--;
		}

        
    }
}
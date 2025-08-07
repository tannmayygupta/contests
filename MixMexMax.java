import java.util.Arrays;
import java.util.Scanner;

public class MixMexMax {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t != 0){
            int n = sc.nextInt();
            int[] arr = new int[n];

            for(int i = 0 ; i < n ; i++){
                arr[i] = Math.abs(sc.nextInt());
            }

            int flag = 0 ;

            for(int j = 0 ; j < n - 2 ; j++){
                
                int mex = mex(arr[j],arr[j+1],arr[j+2]);
                int max = max(arr[j],arr[j+1],arr[j+2]);
                int min = min(arr[j],arr[j+1],arr[j+2]);  

                if(mex != (max - min)){
                    flag = 1 ;
                    break;
                }
            }

            if(flag == 1){
                System.out.println("No");
            }
            else{
                System.out.println("Yes");
            }

            t--;
        }
    }
    static int mex(int a1, int a2, int a3){
            int[] arr = new int[101];
            Arrays.fill(arr,0);
            arr[a1]++;
            arr[a2]++;
            arr[a3]++;

            for(int i = 0 ; i < arr.length ; i++){
                if(arr[i] != 0){
                    return i ;
                }
            }
            return arr.length ;
        }

        static int max(int a1, int a2, int a3){
            if(a1 >= a2 && a1 >= a3){
                return a1 ;
            }
            else if(a2 >= a1 && a2 >= a3){
                return a2 ;
            }

            return a3 ;
        }

        static int min(int a1, int a2, int a3){
            if(a1 <= a2 && a1 <= a3){
                return a1 ;
            }
            else if(a2 <= a1 && a2 <= a3){
                return a2 ;
            }

            return a3 ;
        }
}

import java.util.Scanner;

public class NoCasinointheMountains {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();

        while(t-- != 0){

            int n = sc.nextInt();

            int k = sc.nextInt(); 

            int[] arr = new int[n];

            for(int i = 0 ; i < n ; i++){
                arr[i] = sc.nextInt() ;
            }

            int maxpeak = 0 ;

            int i = 0 ;

            while(i <= arr.length - k){
                int count = 0 ;
                int flag = -1 ;
                for(int j = i ; j < i + k ; j++){
                    if(arr[j] == 0){
                        count++;
                    }
                    else{
                        flag = j ;
                        break;
                    }
                }
                if(k == count){
                    maxpeak++;
                    i+=k+1;
                }
                else if(flag > 0){
                    // i += flag + 1 // what happen here is that our flag = j and j > i so what was happening 
                                     // i = i +  j + 1 ; // this was wrong way 
                                     // we have to substract i so that we get the correct index 
                    i = flag + 1; // skipping for rain day so that we start with next day
                }
                else{
                    i++;
                }

            }

            System.out.println(maxpeak);
        }
    }
}

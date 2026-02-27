import java.util.Scanner;

public class Heapify1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- != 0) {
            int n = sc.nextInt();

            int[] arr = new int[n + 1];

            for (int i = 1 ; i <= n; i++) {
                arr[i] = sc.nextInt();
            }

            for(int i = 1 ; i <= n / 2 ; i++){
                if(arr[i] > arr[i*2]){
                    int temp = arr[i];
                    arr[i] = arr[i*2];
                    arr[i*2] = temp ;
                }
            }

            if(isSorted(arr)){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }

        }
    }

    public static boolean isSorted(int[] arr) {
        for (int i = 1 ; i < arr.length ; i++) {
            if(arr[i] > arr[i+1]){
                return false ;
            }
        }

        return true ;
    }
}

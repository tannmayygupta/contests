import java.util.Scanner;

public class ItsTimeToDuel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t > 0){

            int n = sc.nextInt();

            int[] arr = new int[n];

            for(int i = 0 ; i < arr.length ; i++){
                arr[i] = sc.nextInt();
            }

            int cou = 0 ;

            int sum = 0;
            for (int m = 0; m < n; m++) {
                sum += arr[m];
            }

            if(cou > n - 1){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }

            t--;
        }
    }
}

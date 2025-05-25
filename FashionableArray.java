import java.util.*;

public class FashionableArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t!=0){
            int n = sc.nextInt();

            int[] arr = new int[n];

            for(int i = 0 ; i < n ; i++){
                arr[i] = sc.nextInt();
            }

            Arrays.sort(arr);

            int minpt = 0 ;

            int maxpt = n - 1 ;

                if((arr[minpt] + arr[maxpt]) % 2 == 0){
                    System.out.println(0);
                }

                else if(arr[minpt] % 2 == 0 && arr[maxpt] % 2 != 0){
                    System.out.println(evenStartOddEnd(arr));
                    // evenStartOddEnd(arr);
                }

                else if(arr[minpt] % 2 != 0 && arr[maxpt] % 2 == 0){
                    System.out.println(oddStartEvenEnd(arr));
                    // oddStartEvenEnd(arr);
                }
                else{
                    System.out.println(0);
                }

            t--;
        }

        
    }

    public static int evenStartOddEnd(int[] arr){
        int couE = 0;
        int couO = 0;
        int minpt = 0;
        int maxpt = arr.length - 1;

        while(minpt < arr.length && arr[minpt] % 2 == 0){
            minpt++;
            ++couE;
        }

        while(maxpt >= 0 && arr[maxpt] % 2 != 0){
            maxpt--;
            ++couO;
        }
        // // 2
        // System.out.println(couE);
        // // 3
        // System.out.println(couO);
        
        // if(couE < couO){
        //     minpt = couE ;
        //     System.out.println();
        // }

        return Math.min(couE,couO);
    }

    public static int oddStartEvenEnd(int[] arr){
        int couO = 0;
        int couE = 0;
        int minpt = 0;
        int maxpt = arr.length - 1;

        while(minpt < arr.length && arr[minpt] % 2 != 0){
            minpt++;
            ++couO;
        }

        while(maxpt >= 0 && arr[maxpt] % 2 == 0){
            maxpt--;
            ++couE;
        }

        // System.out.println(couE);

        // System.out.println(couO);

        return Math.min(couO, couE);
    }
}

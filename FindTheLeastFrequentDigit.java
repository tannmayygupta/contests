public class FindTheLeastFrequentDigit {
    public static void main(String[] args) {
        
        int n = 723344511 ;

        System.out.println(getLeastFrequentDigit(n));
    
    }

    public static int getLeastFrequentDigit(int n) {
        // HashSet<Integer> ans = new HashSet<>();

        int[] arr = new int[10];        

        while(n > 0){
            int rem = n % 10 ;
            arr[rem]++;
            n = n / 10 ;
        }

        int min = Integer.MAX_VALUE ;

        int ans = -1 ;

       for(int i = 0 ; i < arr.length ; i++){
           if(arr[i] > 0 && min > arr[i] ){
               min = arr[i];
               ans = i ;
           }
       } 

        return ans ;
    }
}

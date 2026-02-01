import java.util.HashSet;

public class CountMonobitIntegers {
    public static void main(String[] args) {
        System.out.println(countMonobit(5));
    }

    // Q1. Count Monobit Integers©leetcode

    public static int countMonobit(int n) {
        int cou = 0 ;
        for(int i = 0 ; i <= n ; i++){
            if(monobit(i)){
                cou++;
            }
        }
        return cou ;
    }

    public static boolean monobit(int n){
        HashSet<Integer> set = new HashSet<>();

        while(n > 0){
            int rem = n % 2 ;
            set.add(rem);
            if(set.size() > 1){
                return false ;
            }
            n = n / 2 ;
        }

        return true ;
    }
}

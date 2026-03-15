import java.util.Arrays;
// https://leetcode.com/problems/sum-of-gcd-of-formed-pairs/description/
// 3867. Sum of GCD of Formed Pairs
public class SumofGCDofFormedPairs {
    public static void main(String[] args) {
        int[] nums = {3,6,2,8};
        System.out.println(gcdSum(nums));
    }
    public static long gcdSum(int[] nums) {
        int n = nums.length ;
        int curmax = Integer.MIN_VALUE ;
        int[] pr = new int[n];
        for(int i = 0 ; i < n ; i++){
            if(curmax < nums[i]){
                curmax = nums[i];
            }

            pr[i] = gcd(curmax , nums[i]);
        }

        Arrays.sort(pr);

        int j = 0 ;
        int k = n - 1 ;
        long sum = 0 ;
        while(j < k){
            sum += gcd(pr[j],pr[k]);
            j++;
            k--;
        }

        return sum ;
    }

    public static int gcd(int a, int b){
        if(b == 0){
            return a ;
        }

        return gcd(b, a%b);
    }
}

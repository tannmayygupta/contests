import java.util.Scanner;

public class MaximumSubarrayXORwithBoundedRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
    }
    // Q4. Maximum Subarray XOR with Bounded Range©leetcode
    // https://leetcode.com/problems/longest-almost-palindromic-substring/description/
    public static int maxXor(int[] nums, int k) {

        int max = 0 ;
        
        for(int i = 0 ; i < nums.length ; i++){
            int xor = 0 ;
            int min = nums[i] ;
            int max1 = nums[i] ;
            for(int j = i ; j < nums.length ; j++){
                if(min > nums[j]){
                    min = nums[j];
                }
                if(max1 < nums[j]){
                    max1 = nums[j];
                }

                xor ^= nums[j];

                if(max - min <= k){
                    max = Math.max(max,xor);
                }
                
            }
        }

        return max ;
    }
}

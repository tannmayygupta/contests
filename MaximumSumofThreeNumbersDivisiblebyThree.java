import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class MaximumSumofThreeNumbersDivisiblebyThree {
    public static void main(String[] args) {

        int[] nums = {8,3,5,8,4,7} ;

        System.out.println(minOperations(nums));

    }

    // this gives tle so optimized version is here down

    // public static int minOperations(int[] nums) {

    //     // duplicate

    //     int i = 0;
    //     int op = 0;

    //     while (i < nums.length && containDuplicate(nums, i)) {
    //         i += 3;
    //         op++;
    //     }

    //     return op;

    // }

    // public static boolean containDuplicate(int[] arr, int st) {

    //     HashSet<Integer> ans = new HashSet<>();

    //     for (int i = st; i < arr.length; i++) {
    //         if (ans.contains(arr[i])) {
    //             return true;
    //         }
    //         ans.add(arr[i]);
    //     }

    //     return false;
    // }

    public static int minOperations(int[] nums){
        
        int n = nums.length;
        HashMap<Integer, Integer> lo = new HashMap<>();
        int min = 0;
        
        for (int i = 0; i < n; i++) {
            if (lo.containsKey(nums[i])) {

                min = Math.max(min , lo.get(nums[i]) + 1);
            }
            lo.put(nums[i], i);
        }
        
        if (min == 0) {
            return 0;
        }

        return (min + 2) / 3;
    }
}
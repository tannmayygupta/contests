import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MaximumSumofThreeNumbersDivisiblebyThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nums = {4,2,3,1};

        System.out.println(maximumSum(nums));
        
    }

    // Maximum Sum of Three Numbers Divisible by Three

    public static int maximumSum(int[] nums) {
        
        List<Integer> mod0 = new ArrayList<>();
        List<Integer> mod1 = new ArrayList<>();
        List<Integer> mod2 = new ArrayList<>();

        
        for (int num : nums) {
            if (num % 3 == 0) {
                mod0.add(num);
            } else if (num % 3 == 1) {
                mod1.add(num);
            } else {
                mod2.add(num);
            }
        }
        
        Collections.sort(mod0, Collections.reverseOrder());
        Collections.sort(mod1, Collections.reverseOrder());
        Collections.sort(mod2, Collections.reverseOrder());
        
        int maxSum = 0;

        if (mod0.size() >= 3) {
            maxSum = Math.max(maxSum, mod0.get(0) + mod0.get(1) + mod0.get(2));
        }
        

        if (mod1.size() >= 3) {
            maxSum = Math.max(maxSum, mod1.get(0) + mod1.get(1) + mod1.get(2));
        }
        
        if (mod2.size() >= 3) {
            maxSum = Math.max(maxSum, mod2.get(0) + mod2.get(1) + mod2.get(2));
        }

        if (mod0.size() >= 1 && mod1.size() >= 1 && mod2.size() >= 1) {
            maxSum = Math.max(maxSum, mod0.get(0) + mod1.get(0) + mod2.get(0));
        }
        
        return maxSum;
    }
}

import java.util.ArrayList;
import java.util.Scanner;
// Plus-Minus Split
//  https://www.codechef.com/START225C/problems/PSASQ3. House Robber V
public class PlusMinusSplit {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- != 0) {
            int n = sc.nextInt();

            int[] nums = new int[n];

            for (int i = 0; i < n; i++) {
                nums[i] = sc.nextInt();
            }

            ArrayList<Integer> ans = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                // ans.add(nums[i]);
                if (ans.contains(nums[i])) {
                    continue;
                } else {
                    ans.add(nums[i]);
                }
            }

            if (ans.size() == 1) {
                System.out.println("Yes");
            } else if (ans.size() == 2 && (ans.get(0) + ans.get(1)) == 0) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }

        }

    }
}

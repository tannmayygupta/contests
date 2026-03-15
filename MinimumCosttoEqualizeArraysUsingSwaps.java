public class MinimumCosttoEqualizeArraysUsingSwaps {
    // https://leetcode.com/problems/minimum-cost-to-equalize-arrays-using-swaps/
    // 3868. Minimum Cost to Equalize Arrays Using Swaps
    public static void main(String[] args) {
        int[] nums1 = {10,20};
        int[] nums2 = {20,10};
    }
    public static int minCost(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int[] totalfre = new int[80001];
        int[] fre2 = new int[80001];

        for (int i = 0; i < n; i++) {
            totalfre[nums1[i]]++;
        }

        for (int i = 0; i < n; i++) {
            totalfre[nums2[i]]++;
            fre2[nums2[i]]++;
        }

        for (int i = 1; i < totalfre.length; i++) {
            if (totalfre[i] % 2 != 0) {
                return -1;
            }
        }

        int minop = 0;
        int sum = 0;

        for (int i = 1; i < totalfre.length; i++) {
            int fs = totalfre[i] / 2;
            int ex = fre2[i] - fs;
            if (ex > 0) {
                sum += ex;
            }
        }

        minop = sum;
        return minop;
    }
}

// import java.util.Arrays;
// import java.util.HashMap;
// import java.util.Scanner;

// public class MEXrose {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int t = sc.nextInt();

//         while (t-- > 0) {
//             int n = sc.nextInt();

//             int k = sc.nextInt();

//             int[] arr = new int[n];

//             HashMap<Integer, Integer> pres = new HashMap<>();

//             for (int i = 0; i < n; i++) {
//                 arr[i] = sc.nextInt();

//                 if (pres.containsKey(arr[i])) {
//                     int val = pres.get(arr[i]);
//                     pres.put(arr[i], val + 1);
//                 } else {
//                     pres.put(arr[i], 1);
//                 }

//             }

//             int mex = Mex(arr);

//             // System.out.println(mex);

//             if (mex == k) {
//                 System.out.println(0);
//             } else {
//                 int ans = pres.get(k);

//                 System.out.println(ans);
//             }

//         }
//     }

//     public static int Mex(int[] nums) {

//         Arrays.sort(nums);

//         for (int i = 0; i < nums.length; i++) {
//             if (nums[i] != i) {
//                 return i;
//             }
//         }
//         return nums.length;
//     }
// }


// import java.util.HashSet;
// import java.util.Scanner;

// public class MEXrose {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int t = sc.nextInt();
        
//         while (t-- > 0) {
//             int n = sc.nextInt();
//             int k = sc.nextInt();
//             int[] arr = new int[n];
            
//             HashSet<Integer> pres = new HashSet<>();
            
//             for (int i = 0; i < n; i++) {

//                 arr[i] = sc.nextInt();
                
//                 pres.add(arr[i]);
//             }
            
//             int ans = 0;

//             for (int i = 0; i < k; i++) {
//                 if (!pres.contains(i)) {
//                     ans++;
//                 }
//             }

//             if (pres.contains(k)) {
//                 ans++;
//             }
            
//             System.out.println(ans);
//         }

//     }
// }





// import java.util.Scanner;

// public class MEXrose {
//     public static void main(String[] args) {
        
//         Scanner sc = new Scanner(System.in);

//         int t = sc.nextInt();
        
//         while (t-- > 0) {
//             int n = sc.nextInt();
//             int k = sc.nextInt();
            
//             boolean[] present = new boolean[n + 1];
            
//             for (int i = 0; i < n; i++) {
//                 int num = sc.nextInt();
//                 if (num <= n) {
//                     present[num] = true;
//                 }
//             }
            
//             int operations = 0;
            
//             for (int i = 0; i < k; i++) {
//                 if (!present[i]) {
//                     operations++;
//                 }
//             }

//             if (k <= n && present[k]) {
//                 operations++;
//             }
            
//             System.out.println(operations);
//         }
        
//         sc.close();
//     }
// }



import java.util.Scanner;   

// https://codeforces.com/contest/2149/problem/C
// C. MEX rose
// Codeforces Round 1054 (Div. 3)

public class MEXrose {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            
            int k = sc.nextInt();
            
            int[] count = new int[n + 1];
            
            for (int i = 0; i < n; i++) {
                int num = sc.nextInt();
        
                if (num <= n) {
        
                    count[num]++;
        
                }
            }
            
            int missing = 0;
        
            for (int i = 0; i < k; i++) {
        
                if (count[i] == 0) {
        
                    missing++;
        
                }
            }

            int kCount = 0;
        
            if (k <= n) {
        
                kCount = count[k];
        
            }
            
            int ans = Math.max(missing, kCount);
            
            System.out.println(ans);
        }
        
        sc.close();
    }
}
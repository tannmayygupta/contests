import java.util.Scanner;

public class MinMaxDeletion {
    public static void main(String[] args) {
                
        Scanner S = new Scanner(System.in);
        
        int t = S.nextInt();
        
        while (t--> 0) {
            int n = S.nextInt();
            int q = S.nextInt();
            int[] A = new int[n];
            for (int i = 0; i < n; i++) {
                A[i] = S.nextInt();
            }
            long res = 0;
            for (int i = 1; i < n; i++) {
                res += Math.min(A[i - 1], A[i]);
            }
            for (int j = 0; j < q; j++) {
                int id = S.nextInt() - 1;
                int x = S.nextInt();
                if (id > 0)
                    res -= Math.min(A[id - 1], A[id]);
                if (id < n - 1) 
                    res -= Math.min(A[id], A[id + 1]);
                A[id] = x;
                if (id > 0) 
                    res += Math.min(A[id - 1], A[id]);
                if (id < n - 1) 
                    res += Math.min(A[id], A[id + 1]);
                System.out.println(res);
            }
        }
    }
}

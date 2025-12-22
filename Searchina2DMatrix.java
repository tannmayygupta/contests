import java.util.*;
import java.lang.*;
import java.io.*;

public class Searchina2DMatrix {
    public static void main(String[] args) {
        // your code goes here
        // constrains chote hai n^2 me bhi ho jayega
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int m = sc.nextInt();

        int[][] matrix = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int target = sc.nextInt();

        if (bs(matrix, target)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static boolean bs(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;

        int st = 0;
        int end = row * col - 1;

        while (st <= end) {
            int mid = st + (end - st) / 2;
            int val = matrix[mid / col][mid % col];
            if (val == target) {
                return true;
            }
            if (val < target) {
                st = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return false;
    }
}

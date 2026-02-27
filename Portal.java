import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Portal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            
            int[] p = new int[n];
            for (int i = 0; i < n; i++){
                 p[i] = sc.nextInt();
}            
            Deque<Integer> left = new ArrayDeque<>();
            Deque<Integer> mid = new ArrayDeque<>();
            Deque<Integer> right = new ArrayDeque<>();
            
            for (int i = 0; i < x; i++)   left.addLast(p[i]);
            for (int i = x; i < y; i++)   mid.addLast(p[i]);
            for (int i = y; i < n; i++)   right.addLast(p[i]);
            
            int[] result = new int[n];
            
            for (int i = 0; i < n; i++) {
                int best = Integer.MAX_VALUE;
                
                if (!left.isEmpty())  best = Math.min(best, left.peekLast());
                if (!mid.isEmpty())   best = Math.min(best, mid.peekFirst());
                if (!mid.isEmpty())   best = Math.min(best, mid.peekLast());
                if (!right.isEmpty()) best = Math.min(best, right.peekFirst());
                
                result[i] = best;
                
                if (!left.isEmpty() && left.peekLast() == best) {
                    left.pollLast();
                } else if (!mid.isEmpty() && mid.peekFirst() == best) {
                    mid.pollFirst();
                } else if (!mid.isEmpty() && mid.peekLast() == best) {
                    mid.pollLast();
                
                } else {
                    right.pollFirst();
                }
            }
            
            for (int i = 0; i < n; i++) {
                System.out.print(result[i]);
                if (i < n - 1) {
                    System.out.print(" ");
}            }
            System.out.println();
        }
    }
}

import java.util.Scanner;

public class MaximumOnes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        
        for (int z = 0; z < t; z++) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            sc.nextLine();
            String s = sc.nextLine().trim();
            int ones = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '1') {
                    ones++;
                }
            }
            if (ones == 0) {
                System.out.println(0);
                continue;
            }
            int rightmostOne = -1;
            for (int i = s.length() - 1; i >= 0; i--) {
                if (s.charAt(i) == '1') {
                    rightmostOne = i;
                    break;
                }
            }
            int zerosToLeft = 0;
            for (int i = 0; i < rightmostOne; i++) {
                if (s.charAt(i) == '0') {
                    zerosToLeft++;
                }
            }
            
            int maxPossible = ones + Math.min(k, zerosToLeft);
            System.out.println(Math.min(n, maxPossible));
        }
    }
}

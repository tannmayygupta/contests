import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t!=0){
            int n = sc.nextInt();

            String a = sc.next();

            int m = sc.nextInt();

            String b = sc.next();

            String c = sc.next();

            StringBuilder big = new StringBuilder();

            StringBuilder end = new StringBuilder();

            for(int i = 0 ; i < m ; i++){
                char chance = c.charAt(i);
                if(chance == 'V'){
                    big.append(b.charAt(i));
                }
                else if(chance == 'D'){
                    end.append(b.charAt(i));
                }
            }

            String ans = big.reverse().toString() + a + end.toString();

            System.out.println(ans);

            t--;
        }
    }
}

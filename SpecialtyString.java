import java.util.Scanner;
import java.util.Stack;
// C. Specialty String
// https://codeforces.com/contest/2200/problem/C


public class SpecialtyString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t--!=0) {
            int n = sc.nextInt() ;

            String s = sc.next();
            
            Stack<Character> stk = new Stack<>();

            for(int i = 0 ; i < n ; i++){
                char ch = s.charAt(i);

                if(!stk.empty() && stk.peek() == ch){
                    stk.pop();
                }else{
                    stk.push(ch);
                }

            }

            if(stk.empty()){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }

            // for(int i = 0 ; i < n ; i++){
            //     for(int j = i + 1 ; i)
            // }
        }
    }
}

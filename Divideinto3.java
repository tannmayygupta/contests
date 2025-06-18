// https://www.codechef.com/START191D/problems/DIVIDE3 

import java.util.Scanner;

public class Divideinto3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
                
        int N = sc.nextInt();
        
        int ans = N % 3 ;
        
        if(ans == 0){
            System.out.println(0);
        }
        else{
            System.out.println(1);
        }
        
    }
}

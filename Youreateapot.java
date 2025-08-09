import java.util.Scanner;
// B. You're a teapot
// https://atcoder.jp/contests/abc418/tasks/abc418_b
public class Youreateapot {
    public static void main(String[] args) {
        int st = -1 ;
        int end = -1 ;

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        int tcou = 0 ;
        for(int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i) == 't'){
                tcou++;
                if(st == -1){
                    st = i ;
                }
                end = i ;
            }
        }

        double zero = 0.0 ;

        if(st == -1 || end == -1){
            System.out.println(zero);
            
            return;
        }

        String s1 = s.substring(st, end + 1 );

        if(s1.length() < 3){
            System.out.println(zero);
            
            return ;
        }else{
            int numer = tcou - 2;  
            
            int denomi = s1.length() - 2; 
            
            double filling = (double) numer / denomi;

            System.out.println(filling);
        }
    }

    // giving error in some hidden test cases

    // public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);

        // String s = sc.nextLine();

    //     int tcou = 0 ;

    //     int st = -1 ;

    //     int end = -1 ;

    //     for(int i = 0 ; i < s.length() ; i++){
    //         if(s.charAt(i) == 't'){
    //             tcou++;
    //             if(st == -1){
    //                 st = i ;
    //             }
    //             for(int j = i+1 ; j < s.length() ; j++){
    //                 if(s.charAt(j) == 't'){
    //                     st = Math.min(st,i);
    //                     end = Math.max(end , j);
    //                 }
    //             }
    //         }
    //     }

    //     // System.out.println(st);

    //     // System.out.println(end);

    //     // System.out.println(tcou);

    //     double zero = (double) 0 ;

    //     if(st == -1 || end == -1){
    //         System.out.println(zero);
    //     }
    //     else{

    //         String s1 = s.substring(st, end + 1);

    //         System.err.println(s1.length());

    //         if(s1.length() < 3){
    //             System.out.println(zero);
    //         }
    //         else{

    //             int numer = tcou - 2 ; 

    //             int denomi = s1.length() - 2 ;

    //             double filling = (double) numer / denomi ;
                
    //             System.out.println(filling);

    //         }
    //     }

        
    // }
}

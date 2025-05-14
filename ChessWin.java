import java.util.Scanner;

public class ChessWin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int A = sc.nextInt();
        int B = sc.nextInt();
        
        if(A>B){
            System.out.println("0");
        }
        else{
            int min = B - A ;
            
            min = min + 1 ;
            
            System.out.println(min);
        }
    }
}

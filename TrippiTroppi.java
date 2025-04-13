import java.util.*;

public class TrippiTroppi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        sc.nextLine();

        while(t > 0){
    
            String s = sc.nextLine();

            if(s.charAt(0) != ' '){
                System.out.print(s.charAt(0));
            }

            for(int i = 0 ; i < s.length() - 1; i++){
                char c = s.charAt(i);

                if(s.charAt(i) == ' ' && s.charAt(i+1) != ' ' ){
                    System.out.print(s.charAt(i+1));
                }
            }

            System.out.println();

            t--;
        }

    }
}

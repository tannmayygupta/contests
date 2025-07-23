import java.util.Scanner;

public class CloudWatching {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
		
        int A = sc.nextInt();
        int B = sc.nextInt();
        
        if(B >= A * 3){
            System.out.println("Rain");
        }else{
            System.out.println("Dry");
        }
    }
}

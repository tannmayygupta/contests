import java.util.Scanner;

public class PizzaComparision {
    public static void main(String[] args) {
        // your code goes here
		// Pizza Comparision
        // https://www.codechef.com/START219D/problems/PIZZACOMP
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t--!=0 ){
		    int A = sc.nextInt();
		    int B = sc.nextInt();
		    
		    int areaA = 10 * 10 ;
		    int areaB = 15 * 15 ;
		    
		    double costA = (double) areaA / A  ;
		    double costB = (double) areaB / B;
		    
		    if(costA > costB){
		        System.out.println("Small");
		    }else if(costB > costA){
		        System.out.println("Large");
		    }else{
		        System.out.println("Equal");
		    }
		}
    }
}

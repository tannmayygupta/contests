import java.util.* ;

public class Imateapot{

  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    
    String s = sc.next() ;
    
    String tea = "tea";

    if(n < 3){
        System.out.println("No");
    }
    else if(s.substring(n-3, n).equals(tea)){
        System.out.println("Yes");
    }
    else{
        System.out.println("No");
    }
    
  }
}
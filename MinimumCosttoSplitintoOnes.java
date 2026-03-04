public class MinimumCosttoSplitintoOnes {
    public static void main(String[] args) {
        System.out.println(divide(3));
    }
    // Q2. Minimum Cost to Split into Ones©leetcode
    public static int divide(int n ){
        if(n == 1){
            return 0 ;
        }
        int cost = (n - 1) * 1 ; // coz we are spliting in n - 1 and 1 
        int a = divide(n - 1);
        int b = divide(1);

        return cost + a + b ;
    }
}

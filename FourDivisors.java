public class FourDivisors {
    public static void main(String[] args) {
        int[] nums = {21,4,7};
        System.out.println(sumFourDivisors(nums));
    }

    public static int sumFourDivisors(int[] nums) {

        int ans= 0 ;
        

        for(int i = 0 ; i < nums.length ; i++){
            int a = nums[i];
            int cou = 2 ; // for every number the count will be 2 coz as 
                          // every no. is divisible by 1 and itself
            int flag = 0 ;
            int sum = 1 + nums[i] ;
            for(int j = 2 ; j <= (a/2 + 1) ; j++){
                if(a % j == 0){
                    cou++;
                    sum+= i ;
                }
                if(cou > 4){
                    sum = 0 ;
                    break ;
                }
            }
            if(cou == 4){
                ans+=sum ;
            }
        }
        return ans ;
    }
}

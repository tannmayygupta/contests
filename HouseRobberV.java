public class HouseRobberV {
    // Q3. House Robber V
    // https://leetcode.com/contest/biweekly-contest-176/problems/house-robber-v/
    public static void main(String[] args) {
        int[] nums = {18,5,1,8,3,7,9};
        int[] colors = {1,1,1,1,4,5,7};

        System.out.println(rob(nums, colors));
    }

    public static long rob(int[] nums, int[] colors) {

        long ans = 0 ;

        int i = 0 ;

        int n = nums.length ;
        
        while(i < n){
            
            if(i < n - 1 && colors[i] == colors[i+1]){
                int n1 = nums[i];
                int n2 = nums[i+1];
                
                if(n1 >= n2){
                    ans+=n1;
                }

                if(n2 >= n1){
                    ans+=n2;
                }
                i+=2 ;
                
            }else{
                ans+= nums[i];
                i++;
            }
        }

        return ans ;
        
    }
}

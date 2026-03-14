public class FirstUniqueEvenElement {

    public static void main(String[] args) {
        int[] nums = {3,4,2,5,4,6};
        System.out.println(firstUniqueEven(nums));
    }

    public static int firstUniqueEven(int[] nums) {
        int[] fre = new int[101];
        int ans = -1 ;
        for(int i = 0 ; i < nums.length ; i++){
            int n = nums[i];
            fre[n]++;
        }

        for(int i = 0 ; i < nums.length ; i++){
            if(ans == -1 && nums[i] % 2 == 0 && fre[nums[i]] == 1){
                ans = nums[i];
            }
        }

        return ans ;
    }
}
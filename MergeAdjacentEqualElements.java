import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class MergeAdjacentEqualElements {
    public static void main(String[] args) {
        int[] nums = {1,1,2,4,8,16,32,64,128,256,512,1024,2048,4096,8192,16384,32768,65536};
        System.out.println(mergeAdjacent(nums));
        
    }
    
    public static List<Long> mergeAdjacent(int[] nums){
        Stack<Long> stk = new Stack<>();
        // 3 1 1 2
        for(int i = 0 ; i < nums.length ; i++){
            long cur = nums[i] ;
            while (!stk.empty() && stk.peek() == cur) {
                long sum = stk.pop() + cur ;
                stk.push(sum);
                break ;
            }
            stk.push((long) nums[i]);
        }
        List<Long> ar = new ArrayList<>();
        return ar ;
    }

}

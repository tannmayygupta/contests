import java.util.ArrayList;
import java.util.List;

public class MergeAdjacentEqualElements {
    public static void main(String[] args) {
        int[] nums = {1,1,2,4,8,16,32,64,128,256,512,1024,2048,4096,8192,16384,32768,65536};
        System.out.println(mergeAdjacent(nums));
        
    }
    public static List<Long> mergeAdjacent(int[] nums) {

        int n = nums.length ;

        List<Long> ar = new ArrayList<>();

        for(int i = 0 ; i < n ; i++){

            ar.add( (long) nums[i]);

        }

        boolean merge = true ;

        while(merge){

            

            merge = false ;

            // [1,1,2,4,8,16,32,64,128,256,512,1024,2048,4096,8192,16384,32768,65536]

            for(int i = 0 ; i < ar.size() - 1; i++){

                if(ar.get(i).equals(ar.get(i+1))){

                    long sum = (long) ar.get(i) + ar.get(i+1);

                    ar.set(i,sum);

                    ar.remove(i+1);

                    merge = true ;

                    break;

                }

                

            } 

        }

        return ar ;

    }

}

import java.lang.reflect.Array;
import java.util.Arrays;
//  Best Reachable Tower©leetcode
// https://leetcode.com/contest/biweekly-contest-174/problems/best-reachable-tower/
public class BestReachableTower {
    public static void main(String[] args) {
        int[][] towers = { {1,2,5 } , {2,1,7} , {3,1,9} };
        int[] center = {1,1};
        int radius = 2 ;

        System.out.println(Arrays.toString(bestTower(towers, center, radius)));
        
    }
    public static int[] bestTower(int[][] towers, int[] center, int radius) {
        int cx = center[0];
        int cy = center[1];
        int[] ans = {-1,-1};
        int maxquality = Integer.MIN_VALUE ; 
        for(int i = 0 ; i < towers.length ; i++){
            int x = towers[i][0];
            int y = towers[i][1];
            int quality = towers[i][2];
            int manhattandis =  Math.abs(x - cx) + Math.abs(y - cy);
            // maxmanhattandis = Math.max(maxmanhattandis, manhattandis);
            if(manhattandis <= radius){
                if( maxquality < quality || (maxquality == quality && lexicoSmallest(x,y,ans[0],ans[1]))){
                    ans[0] = x ;
                    ans[1] = y ;
                    maxquality = quality ;
                }
            }
        }

        return ans ;
    }
    public static boolean lexicoSmallest(int x , int y , int x1 , int y1){
        if(x1 == -1){
            return true ;
        }
        return (x < x1 || (x == x1  && y < y1)); 
        // this function means to returun the smallest cordinate if x , y is sa
        // the smallest cordinate if x , y is smaller the function return true otherwise false 
    }

}

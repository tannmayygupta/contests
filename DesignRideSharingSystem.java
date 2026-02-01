import java.util.*;
// Q3. Design Ride Sharing System©leetcode 
// https://leetcode.com/contest/weekly-contest-487/problems/design-ride-sharing-system/
public class DesignRideSharingSystem {
    public static void main(String[] args) {
        
    }
}

class RideSharingSystem {
        ArrayList<Integer> driver ;
        ArrayList<Integer> rider ;
    public RideSharingSystem() {
        driver = new ArrayList<>();
        rider = new ArrayList<>();
    }
    
    public void addRider(int riderId) {
        // ArrayList<Integer> rider = new ArrayList<>();
        if(!rider.contains(riderId)){
            rider.add(riderId);
        }
    }
    
    public void addDriver(int driverId) {
        if(!driver.contains(driverId)){
            driver.add(driverId);
        }
    }
    
    public int[] matchDriverWithRider() {
        int[] ans = {-1,-1};

        if(rider.size() == 0 || driver.size() == 0){
            return ans ;
        }
        
        ans[0] = driver.get(0);
        ans[1] = rider.get(0);
        // remove both from system 
        driver.remove(0);
        rider.remove(0);
        return ans ;
    }
    
    public void cancelRider(int riderId) {
        rider.remove(Integer.valueOf(riderId));
    }
}

/**
 * Your RideSharingSystem object will be instantiated and called as such:
 * RideSharingSystem obj = new RideSharingSystem();
 * obj.addRider(riderId);
 * obj.addDriver(driverId);
 * int[] param_3 = obj.matchDriverWithRider();
 * obj.cancelRider(riderId);
 */

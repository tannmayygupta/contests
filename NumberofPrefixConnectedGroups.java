import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
// Q2. Number of Prefix Connected Groups
// https://leetcode.com/contest/biweekly-contest-176/problems/number-of-prefix-connected-groups/description/

public class NumberofPrefixConnectedGroups {
    public static void main(String[] args) {
        String[] words = {"apple","apply","banana","bandit"};
        int k = 2;
        System.out.println(prefixConnected(words, k));
    }
    public static int prefixConnected(String[] words, int k) {

        HashMap<String, ArrayList<String> > grp = new HashMap<>();

        for(int i = 0 ; i < words.length ; i++){
            String s = words[i] ;
            if(k > s.length() ){
                continue ;
            }

            String sub = s.substring(0,k);
            if(grp.containsKey(sub)){
                ArrayList<String> keySub = grp.get(sub);
                keySub.add(s);
            }else{
                ArrayList<String> newS = new ArrayList<>();
                newS.add(s);
                grp.put(sub,newS);
            }
        }

        int cou = 0 ;
        
        for(Map.Entry<String, ArrayList<String> > entry : grp.entrySet()){
            String key = entry.getKey();
            ArrayList<String> values = entry.getValue();

            if(values.size() >= 2){
                cou++;
            }
        }

        return cou ;
    }
}

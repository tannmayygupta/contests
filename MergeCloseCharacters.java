import java.util.ArrayList;
import java.util.List;

public class MergeCloseCharacters {
    public static void main(String[] args) {
        String s = "abca";
        int k = 3;
    }
    public static String mergeCharacters(String s, int k) {

        boolean isMerge = true ;
        List<Character> a = new ArrayList<>();
        
        for(int i = 0 ; i < s.length() ; i++){
            a.add(s.charAt(i));    
        }
        
        while(isMerge){
            isMerge = false ;
            for(int i = 0 ; i < a.size() ; i++){
                int flag = 0 ;
                for(int j = i + 1 ; j < a.size() ; j++){
                    if(a.get(i) == a.get(j) &&  ((j - i) <= k)){
                        isMerge = true ;
                        flag = 1 ;
                        a.remove(j);
                        break ;
                    }
                }
                if(flag == 1){
                    break ;
                }
            }
        }

        StringBuilder sb = new StringBuilder();

        for(int i = 0 ; i < a.size() ; i++){
            sb.append(a.get(i));
        }

        return sb.toString() ;
    }
}

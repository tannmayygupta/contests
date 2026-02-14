public class WeightedWordMapping {
    // Q1. Weighted Word Mapping
    // https://leetcode.com/problems/weighted-word-mapping/description/
    public static void main(String[] args) {
        String[] words = {"abcd","def","xyz"};
        int[] weights = {5,3,12,14,1,2,3,2,10,6,6,9,7,8,7,10,8,9,6,9,9,8,3,7,7,2};
        System.out.println(mapWordWeights(words, weights));
    }

    public static String mapWordWeights(String[] words, int[] weights) {

        StringBuilder ans = new StringBuilder("");

        int[] map = {25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1,0};
        
        for(int i = 0 ; i < words.length ; i++){
            int sum = 0 ;
            String s = words[i] ;
            
            for(int j = 0 ; j < s.length() ; j++){
                char ch = s.charAt(j);
                int c = ch - 'a';
                sum += weights[c] ;
            }
            
            int charfin = sum % 26 ;
            
            for(int m = 0 ; m < 26 ; m++){
                if(charfin == map[m]){
                    char op = (char) (m + 'a') ;
                    ans.append(op);
                }
            }
        }

        return ans.toString();
        
    }
}

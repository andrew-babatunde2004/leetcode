import java.util.Collections;
import java.util.HashMap;

class Solution {
    public boolean isSubsequence(String s, String t) {

        HashMap<Character,Integer> sub = new HashMap<>();

        for(int i = 0; i < s.length() ; i++){
            sub.put(s.charAt(i), i);
            }

           for(char c : t.toCharArray()) {
            //??
            if(sub.containsKey(c)){
                sub.remove(c); 
            }
           }
           // figure out HOW to index hashmaps then check if the number found is the lowest value in the hashmap
           // then remove said vlaue until the hashmap is empty
           if(sub.isEmpty()){
            return true;
           }
           return false;
        }
        
        
    }


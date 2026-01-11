

class Solution {
    public boolean isSubsequence(String s, String t) {
        // use a string builder to remove the subsequence characters 
        StringBuilder sub = new StringBuilder(s);

        // if the subsequence is already empty then it must be a subsequence
        if(sub.isEmpty()){
            return true;
        }

        // use t length to check every character in the original string
        for(int i = 0; i < t.length(); i++){
            // error check to handle a empty subsequence if we've already found the subsequence
            if(!sub.isEmpty()){
                // if the character in order is at the first index of the subsequence then remove it to then keep the order
                if(t.charAt(i) == sub.charAt(0)){
                    sub.deleteCharAt(0);    
                }
            }
           
        }

        // if the subsequence is empty at the end of the loop then we have correctly found it, if not then return false
           if(sub.isEmpty()){
            return true;
           }
           return false;
        }
        
        
    }


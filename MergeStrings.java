class Solution {
    public String mergeAlternately(String word1, String word2) {
        
        // orignally used a blank string, stringbuilder brought it from 4ms to 1ms so use stringbuilder
        StringBuilder a = new StringBuilder();

        // create a length integer
        int length;

        // make length equal the greater charater length
        if(word1.length() > word2.length()){
            length = word1.length();
        } else {
            length = word2.length();
        }

        // use a for loop to iterate over each word
        for(int i = 0; i < length; i ++){

            // these if statements make sure that if one string is longer we do not throw an out of bounds
            if( i < word1.length()){
                a.append(word1.charAt(i));
            } 
            
            if (i < word2.length()){
                a.append(word2.charAt(i));
            }
        }

        // we then return the merged string
        return a.toString();

        }
        
    }
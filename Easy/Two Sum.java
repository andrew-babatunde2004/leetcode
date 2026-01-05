
class Solution {
    public int[] twoSum(int[] nums, int target) {

    
        // starts at the first index
        for( int i = 0 ; i < nums.length ; i ++){
        
            //iterates through every single remanining number within 
            // the set to see if it equals the target value

            for ( int j = i + 1; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    //creates a new array to then return the two numbers that add to the target numbers
                    return new int[]{nums[i], nums[j]};
                }
            }
            }
            
            // returns a blank array?? if a no numbers add up to the target number
            return new int[]{};
       
       
        }


    }
    

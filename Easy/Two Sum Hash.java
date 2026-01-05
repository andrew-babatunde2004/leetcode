import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
    // learn about maps again
    Map<Integer,Integer> map = new HashMap<>();

    // a for loop to iterate through the array and then map the indexs
    for( int i = 0; i < nums.length; i++) {

        // current number of the index if {2,3,5,6} and i = 2 cur would be 5
        int cur = nums[i];

        // subtract the target number vs the current number to get x so if target was 8, x = 8-5 which is 3
        int x = target - cur;

        // since we are iterating through the array we have already mapped 3 to our hashmap
        if(map.containsKey(x)) {
            return new int[]{map.get(x), i};
        }
        // if we do not find anything then we map the current number to the index we are at
        map.put(cur,i);
    }
    // returns to make the compiler happy
    return null;
     // the only thing I dont understand is map.containsKey(x) would the map not need 2 values or can you just use one value to search through the map if that makes sense
    }
}
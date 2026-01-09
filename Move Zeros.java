
// fix the time complexity I guess
class Solution {
    public void moveZeroes(int[] nums) {  
        // this iterates through the array     
for(int i = 0; i < nums.length; i ++) {

    // this checks the i + 1 value and goes through the rest of the nums through the array 
    for(int j = i + 1 ; j < nums.length; j++) {

            // this can only occur if i is a 0 and j is a non zero it sways the places of the zero and non zero "effectively" moving the zeros to the end of the array
               if (nums[i] == 0 && nums[j] !=0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }

    }
}

      
    }
}





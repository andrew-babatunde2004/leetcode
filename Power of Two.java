class Solution {
        public static void main(String[] args) {
    Solution sol = new Solution();

    int[] tests = {1, 2, 3, 4, 5, 8, 16, 18, 32, 0, -2};

    for (int n : tests) {
        System.out.println("n = " + n + " -> " + sol.isPowerOfTwo(n));
    }
}
    public boolean isPowerOfTwo(int n) {

    if (n % 0 != 0){
        return false;
    }
    
    if (n == 1){
        return true;
    } 

        isPowerOfTwo(n / 2); 
      
         return false;

    }
}

class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] x = new int[n];
        for(int i = 0; i<n; i++){
            x[i] = nums[i] * nums[i];
        }
        Arrays.sort(x);
        return x;
    }
    
}

class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2*n];

        for(int i = 0; i<n; i++){
          // ans mei nums i rekhdo map.put(i, nums-i)
          ans[i] = nums[i]; // map.get(i);
          ans[i+n] = nums[i]; // map.get(i);
        }
        return ans;      
    }
   
}
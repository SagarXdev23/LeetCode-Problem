class Solution {
    public int missingNumber(int[] nums) {
      long n = nums.length;
      long sum = n*(n+1)/2;
      long sumArr = 0;
      for(int i = 0; i < n; i++){
        sumArr = sumArr + nums[i];
      }
      return (int)(sum - sumArr);
  }
}
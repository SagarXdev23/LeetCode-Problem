class Solution {
  public int[] productExceptSelf(int[] nums) {
    int n = nums.length;
    int[] ans = new int[n];
    int mult = 1;

    for (int i = 0; i < n; i++) {
      ans[i] = mult;
      mult *= nums[i];
    }
    mult = 1;
    for (int j = n - 1; j >= 0; j--) {
      ans[j] *= mult;
      mult *= nums[j];
    }
    return ans;
  }
}


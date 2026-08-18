class Solution {
  public int findNumbers(int[] nums) {
    int n = nums.length;

    int countEven = 0;

    for (int i = 0; i < n ; i++) {
      int s = nums[i];
      int count = 0;
      while (s > 0) {
        s = s / 10;
        count++;
      }

      if (count % 2 == 0) {
        countEven++;
      }

    }

    return countEven;
  }
}
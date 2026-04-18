class Solution {

  public int firstPos(int[] nums, int target) {
    
    int start = 0;
    int end = nums.length - 1;
    int firstIdx = -1;

    while (start <= end) {
      int mid = start + (end - start) / 2;
      if (nums[mid] == target) {
        firstIdx = mid;
        end = mid - 1;      
      } else if (target > nums[mid]) {
        start = mid + 1;
      } else {
        end = mid - 1;
      }
    }
    return firstIdx;
  }

  public int lastPos(int[] nums, int target) {
    int lastIdx = -1;
    int start = 0;
    int end = nums.length - 1;

    while (start <= end) {
      int mid = start + (end - start) / 2;
      if (nums[mid] == target) {
        lastIdx = mid;
        start = mid + 1;      
      } else if (target > nums[mid]) {
        start = mid + 1;
      } else
        end = mid - 1;
    }
    return lastIdx;
  }

  public int[] searchRange(int[] nums, int target) {
    if (nums == null || nums.length == 0){
      return new int [] {-1,-1};
    }
      int first = firstPos(nums,target);
      if(first == -1){
        return new int [] {-1,-1};
      }

      int last = lastPos(nums,target);
      return new int [] {first, last};
  }
}
class Solution {
    public int firstidx(int [] nums, int target){
      int first = 0;
      int last = nums.length - 1;
      int firstindx = -1;

      while (first <= last){
        int mid = first + (last - first) / 2;
        
        if(nums[mid] == target){
          firstindx = mid;
          last = mid - 1;
        }
        else if(nums[mid] > target){
          last = mid - 1;
        }
        else{
          first = mid + 1;
        }
      }
      return firstindx;
    }

    public int lastidx(int [] nums, int target){

      int lastindx = -1;
      int first = 0;
      int last = nums.length - 1;

      while(first <= last){
        int mid = first+(last - first)/2;
        if(nums[mid] == target){
          lastindx = mid;
          first = mid + 1;
        }
        else if(nums[mid] > target) 
        {
          last = mid - 1;
        }
        else{
          first = mid + 1;
        }
      }
      return lastindx;

    }
    

    public int[] searchRange(int[] nums, int target) {
        if (nums == null || nums.length == 0){
          return new int [] {-1, -1};
        }

        int first = firstidx(nums, target);
        if (first == -1){
          return new int [] {-1,-1};
        }

        int last = lastidx(nums, target);

        return new int []{first, last};
    }
}
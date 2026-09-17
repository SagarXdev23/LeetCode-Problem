// class Solution {
//     public int[] productExceptSelf(int[] nums) {
//       int n = nums.length;
//       int answer [] = new int [n];
//       answer[0] = 1;
//       for(int i = 1; i < n; i++){
//         answer[i] = answer[i-1] * nums[i-1];
//       }
//       int right = 1;

//       // for suffix 
//       for (int i = n-1; i >= 0; i--){
//         answer[i] *= right;
//         right*=nums[i];
//       }
//       return answer;
//     }
// }

class Solution {
  public int[] productExceptSelf(int[] nums) {
    int n = nums.length, mult = 1;
    int[] ans = new int[n];
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

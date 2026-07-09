import java.util.HashMap;
import java.util.Map;

class Solution {
  public int majorityElement(int[] nums) {
    Map<Integer, Integer> map = new HashMap<>();

    for (int num : nums) {
      int freq = map.getOrDefault(num, 0);

      freq = freq + 1;

      map.put(num, freq);

      if (map.get(num) > nums.length / 2) {
        return num;
      }
    }
    return -1;
  }
}
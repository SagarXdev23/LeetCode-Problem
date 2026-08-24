class Solution {
  public boolean isPalindrome(String s) {
    String s1 = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
  

    int j = s1.length() - 1;

    if (s1.isEmpty())
      return true;
    for (int i = 0; i < s1.length() / 2; i++) {
      if (s1.charAt(i) != s1.charAt(j)) {
        return false;
      }
      j--;
    }
    return true;
  }
}
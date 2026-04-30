class Solution {
    public int lengthOfLastWord(String s) {

        String A [] = s.split(" ");
        int n = A.length;
        return A[n-1].length();
    }
}
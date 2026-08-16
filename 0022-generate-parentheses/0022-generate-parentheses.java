import java.util.List;
import java.util.ArrayList;

class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> l1 = new ArrayList<>();
        generate(n, 0, 0, "", l1);  
        return l1;  
    }
    
    public static void generate(int n, int open, int close, String ans, List<String> l1) {
       
        if (ans.length() == 2 * n) {
            l1.add(ans); 
            return;
        }
        
        
        if (open < n) {
            generate(n, open + 1, close, ans + "(", l1); 
        }
        
            if (close < open) {
            generate(n, open, close + 1, ans + ")", l1);  
        }
    }
}

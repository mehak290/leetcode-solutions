import java.util.Stack;

class Solution {
    public boolean isPalindrome(int x) {
        
        // ❌ negative OR ends with 0 (except 0 itself)
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int org = x;   // store original number
        Stack<Integer> s = new Stack<>();

        // push digits into stack
        while (x != 0) {
            s.push(x % 10);
            x /= 10;
        }

        int rev = 0;

        // build reversed number
        while (!s.isEmpty()) {
            rev = rev * 10 + s.pop();
        }

        return rev == org;
    }
}
import java.util.ArrayDeque;
import java.util.Deque;

public class Solution {
    // 40 -> ( 41
    // 123 -> { 125
    // 91 -> [ 93
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        for (char bracket: s.toCharArray()) {
            if (bracket == 40) stack.addLast(')');
            else if (bracket == 123) stack.addLast('}');
            else if (bracket == 91) stack.addLast(']');
            else if (stack.isEmpty() || stack.removeLast() != bracket) return false;
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.isValid("[]]"));
        System.out.println(solution.isValid("["));
        System.out.println(solution.isValid("]"));
        System.out.println(solution.isValid(""));
        System.out.println(solution.isValid("()"));
        System.out.println(solution.isValid("(({(())}))"));
        System.out.println(solution.isValid("([{(())}))"));
        System.out.println(solution.isValid("()[]{}"));
        System.out.println(solution.isValid("([)]"));
    }
}

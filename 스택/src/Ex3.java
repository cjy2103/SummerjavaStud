import java.util.Stack;

public class Ex3 {
    public static void main(String[] args) {
        String s = "(1+3*(4+5))/(6*(7+8))";
        System.out.println(checkParen(s));
    }

    private static boolean checkParen(String s) {
        Stack<Character> stack = new Stack<>();
        for (Character c : s.toCharArray()) {
            if (c == '(') {
                stack.push(c);
            } else if (!stack.isEmpty()&&c == ')') {
                stack.pop();
            } else if (stack.isEmpty() && c == ')') {
                stack.push(c);
            }
        }
        if (stack.isEmpty()) return true;
        return false;
    }
}

package lab4;
import java.util.Stack;

public class correctParanthesis {
    public boolean corrParen(String input) {
        if (input.isEmpty()) {
            return true;
        } else {
            Stack<Character> stack = new Stack<>();
            for (int i = 0; i < input.length(); i++) {
                char current = input.charAt(i);
                if (current == '(' || current == '[' || current == '{') {
                    stack.push(current);
                } else {
                    if (stack.isEmpty()) {
                        return false;
                    }
                    char peekChar = stack.peek();
                    if ((current == ')' && peekChar != '(')
                            || (current == '}' && peekChar != '{')
                            || (current == ']' && peekChar != '[')) {
                        return false;
                    } else {
                        stack.pop();
                    }
                }
            }
            return true;
        }
    }
}

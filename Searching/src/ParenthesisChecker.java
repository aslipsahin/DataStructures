import java.util.*;

public class ParenthesisChecker {

    public static void main(String[] args) {
        System.out.println(parenthesesChecker());
    }

    public static boolean parenthesesChecker() {
        Scanner scan = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        System.out.println("Parenthesis Checker Test starts\n");
        System.out.println("Enter an expression");
        String exp = scan.next();

        int len = exp.length();
        for (int i = 0; i < len - 1; i++) {
            char ch = exp.charAt(i);
            if (ch == '(')
                stack.push(i);
            else if (ch == ')') {
                if (stack.isEmpty() && last_closing_parenthesis(i, len, exp) == true) {
                    return true;
                }
                else if (stack.isEmpty() && last_closing_parenthesis(i, len, exp) == false) {
                    return false;
                }
                else {
                    stack.pop();
                }
            }
        }
        return exp.charAt(len - 1) != '(';
    }

    public static boolean last_closing_parenthesis(int i, int len, String exp) {
        for (int l = i; l < len; l++) {
            if (exp.charAt(l) != ')') {
                return false;
            }
        }
        return true;
    }

}
package ValidParentheses;

import java.util.Stack;

public class Solution {
  public static void main(String[] args) {
    String brackets = "([])";
    solve(brackets);
  }

  public static boolean solve(String brackets) {
    Stack<Character> stack = new Stack<>();

    char[] characters = brackets.toCharArray();
    for (char bracket : characters) {

      if (bracket == '(' || bracket == '{' || bracket == '[') {
        stack.push(bracket);
      } else {
        if (stack.isEmpty())
          return false;

        char top = stack.pop();
        if ((bracket == ')' && top != '(') ||
            (bracket == '}' && top != '{') ||
            (bracket == ']' && top != '[')) {
          return false;
        }
      }
    }

    return stack.isEmpty();
  }
}
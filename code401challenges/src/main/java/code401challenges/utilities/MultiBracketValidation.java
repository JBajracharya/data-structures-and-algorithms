package code401challenges.utilities;

//import code401challenges.stacksandqueues.Stack;

import java.util.Stack;

public class MultiBracketValidation {
    public static boolean multiBracketValidation(String input){
        char[] charArray = input.toCharArray();
        Stack<Character> brackets = new Stack<>();
        for (char c: charArray) {
            if(c == '{' || c == '[' || c == '(') {
                brackets.push(c);
                
            } else if(c == '}' || c == ']' || c == ')') {
                if(brackets.empty()){
                    return false;
                }
                if((brackets.peek() == '[' && c != ']') || (brackets.peek() == '{' && c != '}') ||
                        (brackets.peek() == '(' && c != ')')){
                    return false;
                }
//                System.out.println("brackets = " + brackets.isEmpty() + brackets.peek());

                if ((brackets.peek() == '[' && c == ']') || (brackets.peek() == '{' && c == '}') ||
                        (brackets.peek() == '(' && c == ')')) {
                    brackets.pop();
                }
            }
        }
        if(!brackets.isEmpty()){
            return false;
        }
        return true;
    }
}

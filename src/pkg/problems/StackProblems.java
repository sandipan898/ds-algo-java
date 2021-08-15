package pkg.problems;
import pkg.lineards.Stack;
import pkg.lineards.TwoStack;

import java.util.Scanner;

public class StackProblems {
    public static void reverseString() {
        Scanner scan = new Scanner(System.in);
        char[] inputStr = scan.nextLine().toCharArray();
        Stack stack = new Stack(inputStr.length);
        for (int i=0; i<inputStr.length; i++) {
            stack.push(inputStr[i]);
        }
        System.out.println(stack.toString());
        String revStr = "";
        for (int i=0; i<inputStr.length; i++) {
            revStr += stack.pop();
        }
        System.out.println("Reversed String: " + revStr);
        scan.close();
    }

    public static char openingBracket(char bracket) {
        if (bracket == ')') return '(';
        else if (bracket == '}') return '{';
        else if (bracket == ']') return '[';
        else return ' ';
    }

    public static boolean isBalancedParenthesis() {
        Scanner scan = new Scanner(System.in);
        char[] inputStr = scan.nextLine().toCharArray();
        Stack stack = new Stack(inputStr.length);
        for (int i=0; i<inputStr.length; i++) {
            if (inputStr[i] == '(' || inputStr[i] == '{' || inputStr[i] == '[') {
                stack.push(inputStr[i]);
            } else {
                if (stack.isEmpty()) return false;
                char opening = stack.pop();
                if (openingBracket(inputStr[i]) != opening) return false;
            }
        }
        return stack.isEmpty();
    }

    public static void twoStacksOperations() {
        TwoStack tstack = new TwoStack(5);
        tstack.pushOne('2');
        tstack.pushOne('5');
        tstack.pushOne('6');
        tstack.pushTwo('1');
        tstack.pushTwo('8');
        tstack.pushTwo('3');
        System.out.println(tstack.popOne());
        System.out.println(tstack.popTwo());
    }
    public static void main(String[] args) {
        // reverseString();
        // System.out.println(isBalancedParenthesis());
        twoStacksOperations();
    }
}

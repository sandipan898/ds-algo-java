package pkg.testclass;
import pkg.lineards.Stack;

public class TestStack {
    public static void main(String[] args) {
        Stack stack = new Stack(5);
        stack.push('5');
        stack.push('4');
        stack.push('7');
        stack.push('1');
        System.out.println(stack.isFull());
        stack.push('9');
        stack.push('2');
        System.out.println(stack.toString());
        System.out.println(stack.searchData('8'));
        System.out.println(stack.searchData('5'));
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.isEmpty());
        System.out.println(stack.toString());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.toString());
        System.out.println(stack.pop());
        System.out.println(stack.isEmpty());
    }
}

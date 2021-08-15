package pkg.lineards;

public class Stack {
    protected char []arr;
    private int size;
    private int top;

    public Stack(int size) {
        this.size = size;
        this.arr = new char[size];
        this.top = -1;
    }
    
    public int getSize() { return size;}
    public void push(char data) {
        if (!this.isFull()) {
            this.arr[++top] = data;
        }
        else System.out.println("Stack Overflow!");
    }
    public char pop() {
        if(isEmpty()) {
            System.out.println("Stack Underflow!");
            System.exit(1);
        }
        return this.arr[top--];
    }
    public boolean isEmpty() {
        return top == -1;
    }
    public boolean isFull() {
        return top == size - 1;
    }
    public char peek() {
        return arr[top];
    }
    public int checkCurrentSize() {
        return top + 1;
    }
    public int searchData(char data) {
        if(isEmpty()) {
            System.out.println("Stack Underflow!");
            return -1;
        }
        for (int i=0; i<=top; i++) {
            if (arr[i] == data)
                return i;
        }
        return -1;
    }
    @Override
    public String toString() {
        if (isEmpty()) return "Stack: Empty";
        String stackStr = "Stack: |";
        for (int i=0; i<=top; i++) {
            stackStr += arr[i] + " ";
        }
        stackStr += "-->";
        return stackStr;
    }
}

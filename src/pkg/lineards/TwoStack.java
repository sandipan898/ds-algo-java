package pkg.lineards;

public class TwoStack extends Stack{
    private int firstTop;
    private int secondTop;

    public TwoStack(int size) {
        super(size);
        firstTop = -1;
        secondTop = super.arr.length;
    }
    public void pushOne(char data) {
        if (!this.isFull()) {
            this.arr[++firstTop] = data;
        }
        else System.out.println("Stack Overflow!");
    }
    public char popOne() {
        if(isEmptyOne()) {
            System.out.println("Stack Underflow!");
            System.exit(1);
        }
        return this.arr[firstTop--];
    }
    public void pushTwo(char data) {
        if (!this.isFull()) {
            this.arr[--secondTop] = data;
        }
        else System.out.println("Stack Overflow!");
    }
    public char popTwo() {
        if(isEmptyTwo()) {
            System.out.println("Stack Underflow!");
            System.exit(1);
        }
        return this.arr[secondTop++];
    }
    public boolean isEmptyOne() {
        return firstTop <= -1;
    }
    public boolean isEmptyTwo() {
        return secondTop >= arr.length;
    }
    public boolean isFull() {
        return secondTop - firstTop <= 1;
    }
    public char peekOne() {
        return arr[firstTop];
    }
    public char peekTwo() {
        return arr[secondTop];
    }
}

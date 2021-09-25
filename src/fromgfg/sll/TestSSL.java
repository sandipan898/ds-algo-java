package fromgfg.sll;

public class TestSSL {
    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.addAt(0, 2);
        sll.addFirst(5);
        sll.addLast(8);
        sll.addAfter(2, 4);
        sll.addAt(4, 10);
        sll.addLast(15);
        sll.addAt(10, 23);
        System.out.println(sll);
        System.out.println("Length: " + sll.length());
        sll.increase(5);
        System.out.println(sll);
        sll.delete(10);
        sll.delete(5);
        sll.delete(15);
        System.out.println(sll);
        sll.addAt(3, 11);
        System.out.println(sll);
        sll.deleteFrom(1);
        System.out.println(sll);
        sll.deleteFrom(4);
        sll.deleteFrom(1);
        System.out.println(sll);
        sll.swap(7, 20);
        System.out.println(sll);
    }
}

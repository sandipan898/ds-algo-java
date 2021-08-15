package pkg.testclass;
import pkg.lineards.LinkedList;
import pkg.lineards.CircularLinkedList;
import pkg.lineards.DoublyLinkedList;

public class TestLinkedList {
    public static void main(String[] args) {
        /*
        LinkedList sLL = new LinkedList();
        sLL.addNodeAtBegin(5);
        sLL.deleteFromEnd();
        sLL.addNodeAtEnd(7);
        sLL.addNodeAtEnd(2);
        sLL.addNodeAtEnd(4);
        sLL.addNodeAtBegin(3);
        sLL.addNodeAtEnd(1);
        sLL.addNodeAtBegin(6);
        sLL.print();
        System.out.println(sLL.search(7));
        System.out.println(sLL.search(1));
        System.out.println(sLL.search(0));
        System.out.println(sLL.search(6));
        sLL.deleteFromBeg();
        sLL.print();
        System.out.println(sLL.deleteByValue(2));
        System.out.println(sLL.deleteByValue(5));
        sLL.print();
        sLL.addNodeAtEnd(3);
        sLL.print();
        System.out.println("No of occurrence of 3: " + sLL.countNumberOfOccr(3));
        System.out.println(sLL.getNodeByIndex(2));
        sLL.getMin();
        sLL.getMax();
        */

        /*
        CircularLinkedList cLL = new CircularLinkedList();
        cLL.addNodeAtBegin(5);
        cLL.deleteFromEnd();
        cLL.print();
        cLL.addNodeAtEnd(7);
        cLL.addNodeAtEnd(2);
        cLL.addNodeAtEnd(4);
        cLL.addNodeAtBegin(3);
        cLL.addNodeAtEnd(1);
        cLL.addNodeAtBegin(6);
        cLL.print();
        System.out.println(cLL.search(7));
        System.out.println(cLL.search(1));
        System.out.println(cLL.search(0));
        System.out.println(cLL.search(6));
        cLL.deleteFromBeg();
        cLL.print();
         */

        DoublyLinkedList dLL = new DoublyLinkedList();
        dLL.addNodeAtBegin(5);
        dLL.deleteFromEnd();
        dLL.addNodeAtEnd(7);
        dLL.addNodeAtEnd(2);
        dLL.addNodeAtEnd(4);
        dLL.addNodeAtBegin(3);
        dLL.addNodeAtEnd(1);
        dLL.addNodeAtBegin(6);
        System.out.println(dLL);
        System.out.println(dLL.search(7));
        System.out.println(dLL.search(1));
        System.out.println(dLL.search(0));
        System.out.println(dLL.search(6));
        dLL.deleteFromBeg();
        System.out.println(dLL);
        dLL.deleteByValue(2);
        dLL.deleteByValue(5);
        System.out.println(dLL);
        dLL.addNodeAtEnd(3);
        System.out.println(dLL);
        dLL.getNodeByIndex(2);
    }
}

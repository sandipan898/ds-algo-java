package pkg.lineards;

public class DoublyCircularLinkedList {
    DoublyNode head = null;
    DoublyNode tail = null;
    int length;

    public DoublyNode createNode(int data) {
        return new DoublyNode(data);
    }

    public void initNode(int data) {
        DoublyNode newNode = createNode(data);
        this.head = newNode;
        this.head.next = this.head.prev = head;
        this.tail = head;
    }

    public void addNodeAtBegin(int data) {
        if (head == null) initNode(data);
        else {
            DoublyNode newNode = createNode(data);
            newNode.next = head;
            newNode.prev = tail;
            head.prev = newNode;
            tail.next = newNode;
            head = newNode;
        }
        length++;
    }
    public void addNodeAtEnd(int data) {
        if (head == null) initNode(data);
        else {
            DoublyNode newNode = createNode(data);
            newNode.prev = tail;
            newNode.next = head;
            tail.next = newNode;
            head.prev = newNode;
            tail = newNode;
        }
        length++;
    }
    public void deleteFromBeg() {
        if (head == null) {
            System.out.println("Can't delete from Empty List");
        } else if (head.next == head) {
            head = tail = null;
        } else {
            DoublyNode temp = head;
            tail.next = head.next;
            head.next.prev = tail;
            head = head.next;
            temp.next = temp.prev = null;
        }
    }
    public void deleteFromEnd() {
        if (head == null) {
            System.out.println("Can't delete from Empty List");
        } else if (head.next == head) {
            head = tail = null;
        } else {
            DoublyNode temp = head;
            head.next = tail.prev;
            tail.prev.next = head;
            tail.next = null;
            tail = tail.prev;
        }
    }
    public int search(int data) {
        if (head == null) return -1;
        int index = -1;
        if (head.getData() == data) return ++index;
        if (head.next == head) return index;
        DoublyNode temp = head;
        while(temp != tail) {
            index++;
            if (temp.getData() == data) return index;
            temp = temp.next;
        }
        if (temp.getData() == data) return ++index;
        return -1;
    }
    @Override
    public String toString() {
        String retString = "H --> ";
        if (head == null) retString = "<Empty List>";
        else {
            DoublyNode temp = this.head;
            while(temp != tail) {
                retString += temp.getData() + " --> ";
                temp = temp.next;
            }
            retString += tail.getData() + " --> H";
        }
        return retString;
    }
}

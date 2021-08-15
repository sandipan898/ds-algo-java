package pkg.lineards;

public class CircularLinkedList extends LinkedList {
    @Override
    public Node addNodeAtBegin(int data) {
        Node newNode = createNode(data);
        if (this.tail == null) {
            this.tail = this.head = newNode;
            tail.next = head;
        }
        else {
            newNode.next = head;
            tail.next = newNode;
            this.head = newNode;
        }
        length++;
        return head;
    }
    @Override
    public Node addNodeAtEnd(int data) {
        Node newNode = createNode(data);
        if (this.head == null) {
            this.tail = this.head = newNode;
            tail.next = head;
        }
        else {
            newNode.next = head;
            tail.next = newNode;
            tail = newNode;
        }
        length++;
        return tail;
    }
    @Override
    public void deleteFromBeg() {
        if (head != null) {
            if (head.next != head) {
                Node temp = head;
                head = head.next;
                temp.next = null;
                tail.next = head;
            } else {
                head = tail = null;
            }
            length--;
        }
    }
    @Override
    public void deleteFromEnd() {
        Node temp = head;
        if (temp != null) {
            if (temp.next == head) {
                head = null;
                tail = null;
            } else {
                while (temp.next != tail) {
                    temp = temp.next;
                }
                temp.next = tail.next;
                tail = temp;
                tail.next = head;
            }
            length--;
        }
    }
    @Override
    public int search(int data) {
        if (head == null) return -1;
        else {
            Node temp = this.head;
            int count = 0;
            if (temp.getData() == data) return count;
            temp = temp.next;
            while(temp != head) {
                count++;
                if (temp.getData() == data) return count;
                temp = temp.next;
            }
        }
        return -1;
    }
    @Override
    public void print() {
        if (head == null) System.out.println("<Empty List>");
        else {
            Node temp = this.head;
            while(temp != tail) {
                System.out.print(temp.getData() + " --> ");
                temp = temp.next;
            }
            System.out.print(temp.getData() + " --> H");
        }
        System.out.println("\nCurrent Length: " + length());
    }
}
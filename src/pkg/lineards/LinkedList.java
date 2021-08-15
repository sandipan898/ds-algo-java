package pkg.lineards;

class Node {
    private int data;
    Node next;

    public Node (int data) {
        this.data = data;
        this.next = null;
    }
    public int getData () {
        return this.data;
    }
}

public class LinkedList {
    Node head = null;
    Node tail = null;
    int length = 0;

    // getters and setters
    public Node getHead() {
        return this.head;
    }
    public Node getTail() {
        return this.tail;
    }
    public Node setHead(Node node) {
        this.head = node;
        return this.head;
    }
    public Node setTail(Node node) {
        this.tail = node;
        return this.tail;
    }
    // Core functions
    public static Node createNode(int data) {
        return new Node(data);
    }
    public Node addNodeAtBegin(int data) {
        Node newNode = createNode(data);
        if (this.tail == null) {
            setTail(newNode);
        }
        else {
            newNode.next = head;
        }
        setHead(newNode);
        length++;
        return head;
    }
    public Node addNodeAtEnd(int data) {
        Node newNode = createNode(data);
        if (this.head == null) {
            setHead(newNode);
        }
        else {
            tail.next = newNode;
        }
        setTail(newNode);
        length++;
        return tail;
    }
    public int search(int data) {
        if (head == null) return -1;
        else {
            Node temp = this.head;
            int count = -1;
            while(temp != null) {
                count++;
                if (temp.getData() == data) return count;
                temp = temp.next;
            }
        }
        return -1;
    }
    public void deleteFromBeg() {
        if (head != null) {
            Node temp = head;
            head = head.next;
            temp.next = null;
            length--;
        }
    }
    public void deleteFromEnd() {
        Node temp = head;
        if (temp.next == null) deleteFromBeg();
        else if (temp!=null) {
            while (temp.next != tail) {
                temp = temp.next;
            }
            temp.next = tail.next;
            tail = temp;
            length--;
        }
    }
    public int deleteByValue(int data) {
        // returns the position
        Node temp = this.head;
        if (temp == null) return -1;
        else {
            int count = -1;
            if (head.getData() == data) {
                deleteFromBeg();
                return ++count;
            }
            while(temp != tail) {
                count++;
                if (temp.next.getData() == data) break;
                temp = temp.next;
            }
            if (temp != tail) {
                temp.next = temp.next.next;
                length--;
                return ++count;
            } else if (temp == tail && tail.getData() == data) {
                deleteFromEnd();
            }
        }
        return -1;
    }
    public int getNodeByIndex(int index) {
        int data = -1;
        if (head != null) {
            Node temp = head;
            while(index > 0 && temp != null) {
                temp = temp.next;
                index--;
            }
            if (temp != null) data = temp.getData();
        }
        return data;
    }
    public int countNumberOfOccr(int data) {
        int count = 0;
        if (head != null) {
            Node temp = head;
            while(temp != null) {
                if (temp.getData() == data) count++;
                temp = temp.next;
            }
        }
        return count;
    }
    public void getMax() {
        if (head != null) {
            Node temp = head;
            int max = temp.getData();
            while (temp.next != null) {
                temp = temp.next;
                if (temp.getData() > max) max = temp.getData();
            }
            System.out.println(max);
        } else {
            System.out.println("Empty List");
        }
    }
    public void getMin() {
        if (head != null) {
            Node temp = head;
            int min = temp.getData();
            while (temp.next != null) {
                temp = temp.next;
                if (temp.getData() < min) min = temp.getData();
            }
            System.out.println(min);
        } else {
            System.out.println("Empty List");
        }
    }
    public int length() {
        return this.length;
    }
    public void print() {
        if (head == null) System.out.println("<Empty List>");
        else {
            Node temp = this.head;
            while(temp != null) {
                System.out.print(temp.getData() + " -->");
                temp = temp.next;
            }
        }
        System.out.println("\nCurrent Length: " + length());
    }
}


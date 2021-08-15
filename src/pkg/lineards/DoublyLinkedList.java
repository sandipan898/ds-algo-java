package pkg.lineards;

class DoublyNode extends Node {
    DoublyNode prev;
    DoublyNode next;

    public DoublyNode(int data) {
        super(data);
        this.prev = null;
        this.next = null;
    }
}
public class DoublyLinkedList {
    DoublyNode head;
    int length;

    public DoublyNode createNode(int data) {
        return new DoublyNode(data);
    }

    public void initNode(int data) {
        DoublyNode newNode = createNode(data);
        this.head = newNode;
    }

    public void addNodeAtBegin(int data) {
        if (head == null) initNode(data);
        else {
            DoublyNode newNode = createNode(data);
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        length++;
    }

    public void addNodeAtEnd(int data) {
        if (head == null) initNode(data);
        else {
            DoublyNode newNode = createNode(data);
            DoublyNode temp = head;
            while(temp.next != null) {
                temp = temp.next;
            }
            newNode.prev = temp;
            temp.next = newNode;
        }
        length++;
    }

    public void deleteFromBeg() {
        if (head == null) {
            System.out.println("Can't delete from Empty List");
        } else {
            DoublyNode temp = head;
            head = head.next;
            if (head != null) {
                head.prev = null;
                temp.next = null;
            }
            length--;
        }
    }

    public void deleteFromEnd() {
        if (head == null) {
            System.out.println("Can't delete from Empty List");
        } else {
            DoublyNode temp = head;
            if (temp.next == null) {
                deleteFromBeg();
            } else {
                while (temp.next != null) {
                    temp = temp.next;
                }
                temp.prev.next = null;
                temp.prev = null;
                length--;
            }
        }
    }

    public void deleteByValue(int data) {
        if (head == null) {
            System.out.println("Can't delete from Empty List");
        } else {
            DoublyNode temp = head;
            if (temp.getData() == data) {
                deleteFromBeg();
            } else {
                while(temp != null) {
                    if (temp.getData() == data) {
                        break;
                    }
                    temp = temp.next;
                }
                if (temp != null && temp.next != null) {
                    temp.prev.next = temp.next;
                    temp.next.prev = temp.prev;
                } else if (temp != null) deleteFromEnd();
                else {
                    System.out.println("Can't find the element");
                }
                length--;
            }
        }
    }

    public int search(int data) {
        if (head == null) return -1;
        DoublyNode temp = head;
        int index = -1;
        while(temp!=null) {
            index++;
            if (temp.getData() == data) {
                return index;
            }
            temp = temp.next;
        }
        return -1;
    }

    public int length() {
        return this.length;
    }

    public void getNodeByIndex(int index) {
        if (head == null) System.out.println("<Empty List>");
        else {
            int i = index;
            DoublyNode temp = this.head;
            while(temp!=null && index > 0) {
                index--;
                temp = temp.next;
            }
            if (temp == null) System.out.println("Index out of range");
            else System.out.println("Element at Index " + i + " is: " + temp.getData());
        }
    }

    @Override
    public String toString() {
        String retString = "";
        if (head == null) retString = "<Empty List>";
        else {
            DoublyNode temp = this.head;
            while(temp != null) {
                retString += temp.getData() + " -->";
                temp = temp.next;
            }
        }
        return retString;
    }
}

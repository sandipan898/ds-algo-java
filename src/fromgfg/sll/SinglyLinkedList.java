package fromgfg.sll;

class Node {
    private int data;
    Node next = null;
    public Node(int data) {
        this.data = data;
    }
    public int getData() {
        return data;
    }
    public void setData(int data) {
        this.data = data;
    }
}
public class SinglyLinkedList {
    Node head;
    int length;

    // Insert methods
    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        length++;
    }
    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) head = newNode;
        else {
            Node temp = head;
            while(temp.next!=null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        length++;
    }
    public boolean addAfter(int target, int data) {
        if (head!=null) {
            Node newNode = new Node(data);
            Node temp = head;
            while(temp!=null) {
                if (temp.getData() == target) {
                    newNode.next = temp.next;
                    temp.next = newNode;
                    length++;
                    return true;
                }
                temp = temp.next;
            }
        }
        return false;
    }
    public boolean addAt(int index, int data) {
        if (index == 0) {
            addFirst(data);
            return true;
        }
        if (head!=null) {
            /* if (index == length - 1) {
                addLast(data);
                return true;
            }
             */
            Node newNode = new Node(data);
            Node temp = head;
            while(temp.next!=null) {
                index--; // 1
                if (index==0) {
                    newNode.next = temp.next;
                    temp.next = newNode;
                    length++;
                    return true;
                }
                temp = temp.next; // . . .
            }
            if (temp.next == null && index > 1){
                System.out.println("Index out of bounds");
            } else if (index == 1) {
                addLast(data);
                return true;
            }
        }
        return false;
    }

    // Delete methods
    public boolean delete(int target) {
        if (head != null) {
            if (head.getData() == target) {
                head = head.next;
                length--;
                return true;
            } else if (head.next != null) {
                Node temp = head;
                while (temp.next != null) {
                    if (temp.next.getData() == target) {
                        temp.next = temp.next.next;
                        length--;
                        return true;
                    }
                    temp = temp.next;
                }
            }
        }
        return false;
    }
    public boolean deleteFrom(int index) {
        if (head != null) {
            if (index == 0) {
                deleteFirst();
                return true;
            }
            Node temp = head;
            while(temp.next != null && --index > 0) {
                temp = temp.next;
            }
            if (index > 0) {
                System.out.println("Index out of bounds");
                return false;
            } else {
                temp.next = temp.next.next;
                length--;
                return true;
            }
        }
        return false;
    }
    public boolean deleteFirst() {
        if (head != null) {
            head = head.next;
            length--;
            return true;
        }
        return false;
    }
    public Node searchPrevNode(int target) {
        if (head!=null) {
            if (head.getData() == target) return null;
            Node temp = head;
            while(temp.next != null) {
                if (temp.next.getData() == target) {
                    return temp;
                }
                temp = temp.next;
            }
        }
        return null;
    }
    public boolean swap(int first, int second) {
        if (head != null && head.next != null) {
            Node fPrevNode = searchPrevNode(first);
            Node sPrevNode = searchPrevNode(second);
            // System.out.println(fPrevNode.getData() + " " + sPrevNode.getData());
            if (fPrevNode != null && sPrevNode != null) {
                Node firstNode = fPrevNode.next;
                Node secondNode = sPrevNode.next;
                if (fPrevNode != null)
                    fPrevNode.next = secondNode;
                else
                    head = secondNode;
                if (sPrevNode != null)
                    sPrevNode.next = firstNode;
                else
                    head = firstNode;
                Node temp = firstNode.next;
                firstNode.next = secondNode.next;
                secondNode.next = temp;
                return true;
            }
        }
        return false;
    }
    public boolean increase(int val) {
        if (head != null) {
            Node temp = head;
            while (temp!=null) {
                temp.setData(temp.getData() + val);
                temp = temp.next;
            }
            return true;
        }
        return false;
    }
    public int lengthRec(Node node) {
        if (node == null) return 0;
        return lengthRec(node.next) + 1;
    }
    public int length() {
        return lengthRec(head);
    }
    public String toString() {
        if (head == null) return "<Empty List>";
        else {
            String retString = "";
            Node temp = this.head;
            while(temp != null) {
                retString += temp.getData() + " -->";
                temp = temp.next;
            }
            return retString;
        }
    }
}

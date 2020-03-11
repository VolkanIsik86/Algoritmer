package LinkedList;

public class LinkedList {

    static class Node{
        int key;
        Node next;
        Node prev;
        Node(int key){
            this.key = key;
        }
    }

    private Node head = null;
    private Node tail = null;

    void insert(Node newNode){
        newNode.next = head;
        newNode.prev = null;
        if(head!=null)
            head.prev=newNode;

        head = newNode;
    }

     Node search(int val){
        Node current = head;

        while (current != null && current.key != val){
            current = current.next;
        }
        return current;
    }

    public static void main(String[] args) {
        Node a = new Node(1);

        Node b = new Node(2);

        Node c = new Node(3);

        Node d = new Node(4);

        LinkedList linkedList = new LinkedList();
        linkedList.insert(a);
        linkedList.insert(b);
        linkedList.insert(c);
        linkedList.insert(d);
    }
}

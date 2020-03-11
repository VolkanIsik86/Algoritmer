package Stack;

public class StackV {
    Node top = null;

    public class Node{
        int key;
        Node prev;
    }

        void push(int i){
            Node node = new Node();
            node.key = i;
            node.prev = top;
            top = node;
        }
        void pop(){
            System.out.println(top.key);
            top = top.prev;

        }


    public static void main(String[] args) {
        StackV stackV = new StackV();
        stackV.push(2);
        stackV.push(5);
        stackV.pop();
        stackV.pop();
    }
}

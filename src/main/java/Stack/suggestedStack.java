package Stack;

public class suggestedStack {
    class Node {
        public Node next;
        public int value;
    }

    class Stack {
        private Node top = null;

        public void push(int e) {
            Node node = new Node();
            node.value = e;

            node.next = top;
            top = node;

        }

        public int pop() {
            if (top == null) {
                throw new IllegalStateException("No elements to pop");
            }
            int value = top.value;

            top = top.next;

            return value;

        }

    }
}

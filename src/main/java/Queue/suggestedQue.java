package Queue;

public class suggestedQue {
    class Node {

        public Node next;

        public int value;

    }


    class Queue {

        // Probably add some local variables here

        private Node start = null, end = null;



        public void enqueue(int e) {

            Node node = new Node();

            node.value = e;

            if (end != null) {

                end.next = node;

            }

            end = node;

            if (start == null) {

                start = node;

            }

        }



        public int dequeue() {

            int value = start.value;

            start = start.next;



            if (start == null) {

                end = null;

            }



            return value;

        }

    }
}

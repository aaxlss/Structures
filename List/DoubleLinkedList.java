public class DoubleLinkedList {

    class Node {
        int data;
        Node next;
        Node prev;

        //Constructor
        public Node (int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
        public Node head = null;
        public Node tail = null;

    

        public void pushNode (int data){
            Node newNode = new Node(data);
            if(head == null){
                head = newNode;
                tail = newNode;
            } else {
                head.next = newNode;
                tail = newNode;
                newNode.prev = head;
            }
        }

        public void appendNode (int data){
            Node newNode = new Node (data);

            if(head == null){
                head = newNode;
                tail = newNode;
            } else {
                head.prev = newNode;
                newNode.next = head;
                head = newNode;
            }
        }
    
        public void display(){
            Node current = head;

            if(head == null){
                System.out.println("List is empty");
            }

            System.out.println("forward");
            while(current != null){
                System.out.println("Current Position: " + current.data + " Next: " + (current.next != null? current.next.data : "null") + "Prev: " + (current.prev != null? current.prev.data:"null"));
                current = current.next;
            }

            System.out.println("reverse");
            current = tail;
            while(current != null){
                System.out.println("Current Position: " + current.data + " Next: " + (current.next != null? current.next.data : "null") + "Prev: " + (current.prev != null? current.prev.data:"null"));
                current = current.prev;
            }
            System.out.println();
        }   
    

    public static void main(String[] args){
        DoubleLinkedList sLit = new DoubleLinkedList();

        sLit.pushNode(1);
        sLit.pushNode(2);
        sLit.appendNode(3);


        sLit.display();
        

    }
}
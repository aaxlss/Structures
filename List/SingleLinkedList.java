public class SingleLinkedList {

    class Node {
        int data;
        Node next;

        //Constructor
        public Node (int data){
            this.data = data;
            this.next = null;
        }
    }
        public Node head = null;
        public Node tail = null;

    
        public void addNode (int data){
            Node newNode = new Node(data);

            if(head == null){
                head = newNode; 
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }

        }
    
        public void display(){
            Node current = head;

            if(head == null){
                System.out.println("List is empty");
            }

            while(current != null){
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }   
    

    public static void main(String[] args){
        SingleLinkedList sLit = new SingleLinkedList();

        sLit.addNode(1);
        sLit.addNode(4);
        sLit.addNode(15);
        sLit.addNode(6);
        sLit.addNode(189);


        sLit.display();
        

    }
}
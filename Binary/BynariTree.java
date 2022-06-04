package Binary;


public class BynariTree {
    Node root;

    BynariTree(int key){
        root = new Node(key);
    }

    BynariTree(){
        root = null;
    }



    public static void main(String[] args) {
        BynariTree tree = new BynariTree();

        tree.root = new Node(1);

        tree.root.left = new Node(2);
        tree.root.rigth = new Node(3);

        tree.root.left.left = new Node(4);

    }

}

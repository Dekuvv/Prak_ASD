package Jobsheet11;

public class BinaryTree {
    Node root;

    boolean isEmpty () {
        return root == null;
    }

    boolean find(int data){
        boolean hasil = false;
        Node current = root;

        while (current != null){
            if (current.data == data){
                hasil = true;
                break;
            }else if(data < current.data){
                current = current.left;
            }else{
                current = current.right;
            }
        }
        return hasil;
    }
    
    void add (int data){
        if (isEmpty()){
            root = new Node(data);
        }else{
            Node current = root;

            while (true){
                if (data < current.data){
                    if (current.left != null){
                        current = current.left;
                    }else{
                        current.left = new Node(data);
                        break;
                    }
                }else if(data > current.data){
                    if (current.right != null){
                        current = current.right;
                    }else{
                        current.right = new Node(data);
                        break;
                    }
                }else{
                    //data already exist
                    break;
                }
            }
        }
    }

    void traversePreOrder(Node node){
        if (node != null){
            System.out.println(" " + node.data);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    void traversePostOrder(Node node){
        if (node != null){
            traversePreOrder(node.left);
            traversePreOrder(node.right);
            System.out.println(" " + node.data);
        }
    }
    
    void traverseInOrder(Node node){
        if (node != null){
            traversePreOrder(node.left);
            System.out.println(" " + node.data);
            traversePreOrder(node.right);
        }
    }

    Node getSuccessor(Node del){
        Node successor = del.right;
        Node successorParent = del;

        while (successor.left != null){
            successorParent = successor;
            successor = successor.left;
        }

        if (successor != del.right){
            successorParent.left = successor.right;
            successor.right = del.right;
        }

        return successor;
    }

    void delete (int data){
        if (isEmpty()) {
            System.out.println("Tree is empty!");
            return;
        }

        // find node (current) that will be deleted 
        Node parent = root;
        Node current = root;
        boolean isLeftChild = false;
        while (current != null) {
            if (current.data == data) {
                break;
            } else if (data < current.data) { 
                parent = current;
                current = current.left; 
                isLeftChild = true;
            }else if (data> current.data) {
                parent = current;
                current = current.right;
                isLeftChild = false;
            }
        }

        // deletion
        if (current == null) {
            System.out.println("Couldn't find data!");
            return;
        } else {
        // if there is no child, simply delete it
            if (current.left == null && current.right == null) {
                if (current == root) {
                    root = null;
                } else {
                    if (isLeftChild) {
                        parent.left = null;
                    } else {
                        parent.right = null;
                    }
                }    
            }else if (current.left == null) {// if there is 1 child (right)
                if (current == root) {
                    root = current.right;
                } else {
                    if (isLeftChild) {
                        parent.left = current.right;
                    } else {
                        parent.right = current.right;
                    }
                }        
            }else if(current.right == null){// if there is 1 child (left)
                if (current == root){
                    root = current.left;
                }else{
                    if(isLeftChild){
                        parent.left = current.left;
                    }else{
                        parent.right = current.left;
                    }
                }
            }else{// if there are 2 children
                Node successor = getSuccessor(current);
                if(current == root){
                    root = successor;
                }else{
                    if(isLeftChild){
                        parent.left = successor;
                    }else{
                        parent.right = successor;
                    }

                    successor.left = current.left;
                }
            }
        }
    }

    void printLeaf(Node node) {
        // Basis kasus
        if (node == null) {
            System.out.println("Tree Kosong");
        }

        // Jika node adalah leaf node, cetak data node
        if (node.left == null && node.right == null) {
            System.out.print(node.data + " ");
            return;
        }

        // Rekursi ke subtree kiri
        if (node.left != null) {
            printLeaf(node.left);
        }
     
        // Rekursi ke subtree kanan
        if (node.right != null) {
            printLeaf(node.right);
        }
        
    }

    int countLeaf(Node node) {
        // Basis kasus
        if (node == null) {
            return 0;
        }

        // Jika node adalah leaf node, cetak data node
        if (node.left == null && node.right == null) {
            return 1;
        }

        // Rekursi ke subtree kiri
        return countLeaf(node.left) + countLeaf(node.right);
    }

}
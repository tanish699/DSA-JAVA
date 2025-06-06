// package Trees;

public class BinarySearchTree {
    Node root;

    class Node{
        int value;
        Node left;
        Node right;

        private Node(int value){
            this.value = value;
        }
    }

 // Insert Node in Tree
    public boolean insert(int value){
        Node newNode = new Node(value);
        if(root==null){
            root = newNode;
            return true;
        }
        Node temp = root;
        while(true) {
           if(temp.value==newNode.value) return false;
           if(newNode.value<temp.value){
            if(temp.left==null){
                temp.left=newNode;
                return true;
            }
            temp=temp.left;
        } else {
            if(temp.right==null){
                temp.right=newNode;
                return true;
            }
            temp=temp.right;
            } 
        }
    }
    
 //Contains in a BST
    public boolean contains(int value){
        if(root == null) return false;
        Node temp = root;
        while(temp!= null){
            if(value<temp.value){
                temp=temp.left;
            }
            else if(value>temp.value){
                temp = temp.right;
            }
            else {
                return true;
            }
        }
        
        return false;
    }
    
    public static void main(String[] args) {
        System.err.println("Code compiled Sucessfully");
    }
}

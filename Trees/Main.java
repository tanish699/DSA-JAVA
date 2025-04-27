// package Trees;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree myBST = new BinarySearchTree();
        myBST.insert(3);
        myBST.insert(5);
        myBST.insert(10);
        myBST.insert(2);
        System.out.println("root "+ myBST.root.value);
        System.out.println("root "+ myBST.root.left.value);
        System.out.println("root "+ myBST.root.right.value);
        System.out.println("root "+ myBST.root.right.right.value);
        System.out.println(myBST.contains(69));
    }
}

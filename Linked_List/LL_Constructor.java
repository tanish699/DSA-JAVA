package Linked_List;

public class LL_Constructor {
    private Node Head;  // A reference to the first node of the linked list.
    private Node Tail;  // A reference to the last node of the linked list.
    private int length; // An integer tracking the number of nodes in the list.

    class Node{  // This defines an inner class Node, which represents a node in the linked list.
        int value; // An integer storing the data.
        Node next; // A reference to the next node (not initialized in the constructor).
        
        // The constructor initializes value but does not initialize next, meaning it remains null by default

        
        Node(int value){
            this.value = value;
            
        }
    }

    public LL_Constructor(int value){
        Node newNode = new Node(value);
        Head = newNode;
        Tail = newNode;
        length = 1;
    }
}

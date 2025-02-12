// package Linked_List;

public class LinkedList {
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

    public LinkedList(int value){
        Node newNode = new Node(value);
        Head = newNode;
        Tail = newNode;
        length = 1;
    }
/*---------------------------------------------------------------------------------------------------------------*/
    //To print linked list
    public void print(){
        Node temp = Head;
        while(temp != null){
            System.out.println(temp.value);
            temp = temp.next;
        }

    }
    
    //To print value of head
    public void getHead() {
        System.out.println("Head: " + Head.value);
    }

    //To print value of Tail
    public void getTail() {
        System.out.println("Tail: " + Tail.value);
    }

    //To print Length of Linked list
    public void getLength() {
        System.out.println("Length: " + length);
}

/*--------------------------------------------------------------------------------------------------------------*/
// To append a Node to LinkedList

    public void append(int value){
        Node newNode = new Node(value);

        if(length==0){
            Head=newNode;
            Tail=newNode;
        } else{
            Tail.next=newNode;
        } 
        length++;
    }




public static void main(String[] args) {
    LinkedList Mylinkedlist = new LinkedList(4);

        Mylinkedlist.getHead();
        Mylinkedlist.getTail();
        Mylinkedlist.getLength();
        Mylinkedlist.print();
}

}

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
            Tail = newNode;
        } 
        length++;
    }
/*--------------------------------------------------------------------------------------------------------------*/
//To remove Last node of linked list
public Node removeLast(){
    if(length==0) return null;
    
    Node temp = Head;
    Node pre = Head;
    while(temp.next!=null){
        pre = temp;
        temp = temp.next;
    }
    Tail = pre;
    Tail.next = null;
    length--;
    if(length==0){ //If Linked list has only single element
      Head = null;
      Tail = null;
    } 
    return temp;
}
/*--------------------------------------------------------------------------------------------------------------*/
//To prepend a node in linked list
public void prepend(int value){
    Node newNode = new Node(value);
    if(length==0){
        Head=newNode;
        Tail=newNode;
    } else {
      newNode.next = Head;
      Head = newNode;
    } length++;
}
/*--------------------------------------------------------------------------------------------------------------*/
//To prepend a node in linked list
public Node removeFist(){
    if(length==0) return null;
    Node temp = Head;
    Head=Head.next;
    temp.next=null;
    length--;
    if(length==0){
        Tail=null;
    }
    return temp;
}
/*--------------------------------------------------------------------------------------------------------------*/
//To Get a node in linked list
public Node Get(int index){
    if(index<0 || index >=length){
        return null;
    }
    Node temp = Head;
    for(int i = 0;i<index;i++){
        temp = temp.next;
    }
    return temp;
}
/*--------------------------------------------------------------------------------------------------------------*/
//To Set a node in linked list
public boolean Set(int index, int value){
    Node temp = Get(index);
    if(temp!=null){
        temp.value=value;
        return true;
    }
    return false;
}
/*--------------------------------------------------------------------------------------------------------------*/
//To Insert a node in linked list
public boolean Insert(int value, int index){
    if(index<0||index>length){
        return false;
    }
    if(index==0){
        prepend(value);
        return true;
    }
    if(index==length){
        append(value);
        return true;
    }
    Node newNode = new Node(value);
    Node temp = Get(index-1);
    newNode.next=temp.next;
    temp.next=newNode;
    length++;
    return true;
}


public static void main(String[] args) {
    LinkedList Mylinkedlist = new LinkedList(4);

        System.out.println("Compilation sucess Without errors "+ Mylinkedlist);
}

}

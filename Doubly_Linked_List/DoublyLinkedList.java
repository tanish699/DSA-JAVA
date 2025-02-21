// package Doubly_Linked_List;

public class DoublyLinkedList {
    
    private Node head;
    private Node tail;
    private int length;
    class Node{  
        int value;
        Node next; 
        Node prev;
        Node(int value){
            this.value = value;
            
        }
    }

    public DoublyLinkedList(int value){
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length=1;
    }
 
/*---------------------------------------------------------------------------------------------------------------*/
    //To print linked list
    public void print(){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.value);
            temp = temp.next;
        }

    }
    
    //To print value of head
    public void getHead() {
        System.out.println("Head: " + head.value);
    }

    //To print value of Tail
    public void getTail() {
        System.out.println("Tail: " + tail.value);
    }

    //To print Length of Linked list
    public void getLength() {
        System.out.println("Length: " + length);
    }    

/*---------------------------------------------------------------------------------------------------------------*/
    //To append a node in doubly linked list
    public void append(int value){
	    Node newNode = new Node(value);
	    if(length == 0){
	        head = newNode;
	        tail = newNode;
	    } else {
            tail.next = newNode;
	        newNode.prev = tail;
	        tail = newNode;
        }
	    
	    length++;
	}
/*---------------------------------------------------------------------------------------------------------------*/
    //To removeLast node in doubly linked list
    public Node removeLast(){
        if(length==0){
            return null;
        }
        Node temp = tail;
        if(length==1){
            head = null;
            tail = null;
        } else {
            tail=tail.prev;
            tail.next=null;
            temp.prev=null;
        } length--;
        return temp;
    }   

    public static void main(String[] args) {
        System.out.println("Code Runed Sucessfully");
    }
}




public class Queue {
     
    private Node first;
    private Node last;
    private int length;

    class Node{
        int value;
        Node next;

        Node(int value){
            this.value=value;
        }
    }

    public Queue(int value){
        Node newNode = new Node(value);
        first = newNode;
        last = newNode;
        length = 1;
    }

// Queue Printing
    public void printQueue() {
        Node temp = first;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
        System.out.println("---------");
    }

    public void getFirst() {
        if (first == null) {
            System.out.println("First: null");
        } else {
            System.out.println("First: " + first.value);
        }
    }

    public void getLast() {
        if (last == null) {
            System.out.println("Last: null");
        } else {
            System.out.println("Last: " + last.value);
        }
    }

    public void getLength() {
        System.out.println("Length: " + length);
    }

// Adding a Node in Queue
    public void enque(int value){
        Node nn = new Node(value);
        if(length==0){
            first = nn;
            last = nn;
        } else {
           last.next = nn;
           last = nn;
        }
        length++;
    }

// Adding a Node in Queue
    public Node deque(){
        if(length==0){
            return null;
        }
        Node temp = first;
        if(length==1){
            first = null;
            last = null;
        } else {
            first=first.next;
            temp.next=null;
        }
        length--;
        return temp;
    }



    public static void main(String[] args) {
        System.out.println("Code executed Sucessfully");

        Queue qt = new Queue(0);
        qt.printQueue();
        qt.enque(1);
        qt.enque(2);
        qt.enque(9);
        qt.printQueue();
        qt.deque();
        qt.printQueue();


    }
}

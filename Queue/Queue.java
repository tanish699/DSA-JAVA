

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




    public static void main(String[] args) {
        System.out.println("Code executed Sucessfully");

        Queue qt = new Queue(0);

        
    }
}

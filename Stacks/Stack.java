

public class Stack {
    private Node top;
    private int height;

    class Node{
        int value;
        Node next;  //Bu default null

        Node(int value){
            this.value = value;
        }
    }

    public Stack(int value){
        Node newNode = new Node(value);
        top = newNode;
        height = 1;
    }

// Printing Stacks
    public void printStack() {
        Node temp = top;
        while (temp != null) {
        System.out.println(temp.value);
        temp = temp.next;
        }
    }    
    
    public void getTop () {
      System.out.println("Top: " + top. value);
    }
        
    public void getHeight() {
       System.out.println("Height: " + height);
    }

// Adding element in Stack
    public void push(int value){
        Node newNode = new Node(value);
        if(height==0){
            top = newNode;
        } else{
            newNode.next = top;
            top = newNode;
            
        } 
        height++;
    }

// Removing element from stack
    public Node pop(){
        Node temp = top;
        if(height==0){
          return null;
        } else {
          top = top.next;
          temp.next = null;
        }
        height--;
        return temp;
    }
 
    public static void main(String[] args) {
        System.out.println("Code executed Without errors");
    }

    
}

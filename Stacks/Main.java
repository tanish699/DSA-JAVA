

public class Main {

    public static void print(){
        System.out.println("-------");
    }
    public static void main(String[] args) {
        Stack myStack = new Stack(0);

        // myStack.printStack();
        // myStack.getTop();
        // myStack.getHeight();
        print();
        myStack.push(1);
        // myStack.printStack();
        // print();
        myStack.push(2);
        myStack.push(9);
        // myStack.printStack();
        // myStack.getHeight();
        // myStack.getTop();
        // System.out.println(myStack.pop().value);
        print();
        myStack.printStack();

    }
}

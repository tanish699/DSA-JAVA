// package Linked_List;

public class Main {
    public static void main(String[] args) {
        
        LinkedList Mylinkedlist = new LinkedList(0);

        // Mylinkedlist.getHead();
        // Mylinkedlist.getTail();
        // Mylinkedlist.getLength();

        // Mylinkedlist.print();
        Mylinkedlist.append(1);
        Mylinkedlist.append(2);
        Mylinkedlist.append(3);
        Mylinkedlist.print();
        // Mylinkedlist.getLength();
        System.out.println("-------");
        // // System.out.println(Mylinkedlist.Get(2).value);
        // System.out.println(Mylinkedlist.Set(1, 9));
        // System.out.println(Mylinkedlist.removeLast().value);
        // Mylinkedlist.prepend(8);
        // System.out.println(Mylinkedlist.removeFist().value);
        Mylinkedlist.Insert(9, 2);
        Mylinkedlist.print();




    }
}

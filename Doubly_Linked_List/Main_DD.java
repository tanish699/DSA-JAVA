// package Doubly_Linked_List;

public class Main_DD {
    public static void main(String[] args) {
        DoublyLinkedList myDDL = new DoublyLinkedList(8);
        myDDL.append(9);
        myDDL.append(7);
        myDDL.append(6);
        myDDL.print();
        System.out.println("-----------");
        // myDDL.removeLast();
        // myDDL.prepend(1);
        // myDDL.removeFirst();
        // System.out.println(myDDL.get(4).value);
        // myDDL.set(0, 1);
        // myDDL.insert(1, 1);
        myDDL.remove(2);
        myDDL.print();
    }
}

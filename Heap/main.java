public class main {

    public static void main(String[] args) {
       Heap myHeap = new Heap();
       myHeap.insert(10);
       myHeap.insert(99);
       myHeap.insert(89);
       myHeap.insert(79); 

       System.out.println(myHeap.getHeap());
       
       myHeap.insert(100);
       myHeap.insert(69);

       System.out.println(myHeap.getHeap());

       myHeap.remove();
       System.out.println(myHeap.getHeap());

       myHeap.remove();
       System.out.println(myHeap.getHeap());
       
    }
    
}

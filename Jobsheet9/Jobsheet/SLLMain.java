package Jobsheet9.Jobsheet;

public class SLLMain {
    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList();
        myLinkedList.print();
        myLinkedList.addFirst(800);
        myLinkedList.print();
        myLinkedList.addFirst(700);
        myLinkedList.print();
        myLinkedList.addLast(500);
        myLinkedList.print();
        myLinkedList.insertAfter(700, 300);
        myLinkedList.print();
        myLinkedList.insertBefore(700, 200);
        myLinkedList.print();
        myLinkedList.removeAt(2);
        myLinkedList.print();

        // myLinkedList.getData(2);
        // myLinkedList.insertAt(2, 100);
        // myLinkedList.print();

        // System.out.println("Data pada index ke-1: " + myLinkedList.getData(1));
        // System.out.println("Data 300 berada pada index: " + myLinkedList.indexOf(300));

        // myLinkedList.remove(300);
        // myLinkedList.print();
        // myLinkedList.removeFirst();
        // myLinkedList.print();
        // myLinkedList.removeLast();
        // myLinkedList.print();

    }
}
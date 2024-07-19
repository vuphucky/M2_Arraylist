// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("TESTING");
        MyLinkedList linkedList = new MyLinkedList(10);

        linkedList.addFist(11);
        linkedList.addFist(12);
        linkedList.addFist(13);
        
        linkedList.add(4,9);
        linkedList.add(4,9);
        linkedList.printList();
    }
}
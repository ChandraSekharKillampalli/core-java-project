package core;

public class MiddleLinkedList {

    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public Node head = null;
    public Node tail = null;

    private void addNode(int data){

        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
        } else{
            tail.next = newNode;
        }
        tail = newNode;
    }
    private void display(){
        Node current = head;
        if(current == null){
            System.out.println("Linked List is empty");
        }
        while(current != null){
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
    private void printMiddle(int offset){
        Node fastPtr = head;
        Node slowPtr = head;
            while(fastPtr != null && fastPtr.next != null) {
                fastPtr = fastPtr.next.next;
                slowPtr = slowPtr.next;
            }
                for (int i = 0; i < offset; i++) {
                    if (slowPtr != null) {
                        slowPtr = slowPtr.next;
                    } else {
                        System.out.println("Offset exceeds list bounds.");
                        return;
                    }
                }

                // Step 3: Print the data
                if (slowPtr != null) {
                    System.out.println("\nElement at middle + offset is: " + slowPtr.data);
                } else {
                    System.out.println("Offset leads to null element.");
                }
    }

    public static void main(String[] args){
        MiddleLinkedList mList = new MiddleLinkedList();
        for(int i = 1; i<= 15; i++){
            mList.addNode(i);
        }

        mList.display();
        mList.printMiddle(2);
    }
}

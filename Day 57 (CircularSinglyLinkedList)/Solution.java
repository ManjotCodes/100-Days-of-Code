public class Solution {

    public Node Head;
    public Node Tail;
    public int size;

    //Creation of Circular Singly LinkedList
    public Node CreateCircularSinglyLL (int nodeValue){
        Node node = new Node();
        node.value = nodeValue;
        node.next = node;
        Head = node;
        Tail = node;
        size = 1;
        return Head;
    }
    //Insertion in Circular Singly Linked List
    public void Insertion(int nodeValue ,int location){
        Node node = new Node();
        node.value = nodeValue;

        if(Head == null){
            CreateCircularSinglyLL(nodeValue);
            return;
        }
        else if (location == 0) {   //Insertion in the beginning
            node.next=Head;
            Head=node;
            Tail.next = Head;
        }
        else if (location >=size) {   //Insertion in the end
            Tail.next = node;
            Tail = node;
            Tail.next = Head;
        } else {                     //Insertion after a specific node
            Node tempNode = Head;
            int i=0;
            while (i < location) {
                tempNode = tempNode.next;
                i++;
            }
            node.next = tempNode.next;
            tempNode.next = node;
        }
        size++;
    }
    //Traverse the circular Singly Linked List
    public void Traverse(){
        if(Head != null){
            Node tempNode = Head;
            for(int i=0 ; i<size ;i++) {
                System.out.print(tempNode.value);
                if (i != size-1) {
                    System.out.print("->");
                }
                tempNode = tempNode.next;
            }
            System.out.println("\n");
        }
        else {
            System.out.println("Circular Singly Linked List Does not exits!");
        }
    }

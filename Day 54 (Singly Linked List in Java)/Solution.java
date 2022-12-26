public class Solution {

    public Node Head;
    public Node Tail;
    public int size;

    public Node CreateSinglyLinkedList(int nodeValue){
        Node node = new Node();
        node.next = null;
        node.value = nodeValue;
        Head = node;
        Tail = node;
        size = 1;
        return Head;
    }
    //Insertion method in Linked List
    public void InsertInLinkedList(int nodeValue , int location){
        Node node = new Node();
        node.value = nodeValue;
        if(Head == null){
            CreateSinglyLinkedList(nodeValue);
            return;
        } else if (location == 0) {    //insertion in beginning
            node.next = Head;
            Head = node;
        } else if (location >= size) {   //insertion at the end
            node.next = null;
            Tail.next = node;
            Tail = node;
        } else {       //insertion after Specified node
            Node TempNode = Head;
            int i = 0;
            while(i < location-1){
                TempNode = TempNode.next;
                i++;
            }
            Node nextNode = TempNode.next;
            TempNode.next = node;
            node.next = nextNode;
        }
        size++;
    }

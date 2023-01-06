public class Solution {
    DNode Head;
    DNode Tail;
    int size;

    //Creating a Doubly Linked List
    public DNode CreateDoublyLL(int nodeValue){
        DNode node = new DNode();
        node.value = nodeValue;
        node.next=null;
        node.prev=null;
        Head = node;
        Tail = node;
        size =1;
        return Head;
    }
    //Insertion in Doubly Linked List
    public void Insertion(int nodeValue,int location){
        DNode node = new DNode();
        node.value=nodeValue;
        if(Head == null){
            CreateDoublyLL(nodeValue);
            return;
        }
        else if(location == 0){
            node.prev=null;
            node.next=Head;
            Head = node;
        }
        else if (location>=size){
            node.next = null;
            Tail.next=node;
            node.prev=Tail;
            Tail = node;
        }
        else{
            DNode tempNode = Head;
            for(int i=0;i<location-1;i++){
                tempNode=tempNode.next;
            }
            node.prev = tempNode;
            node.next = tempNode.next;
            tempNode.next = node;
            node.next.prev = node;
        }
        size++;
    }

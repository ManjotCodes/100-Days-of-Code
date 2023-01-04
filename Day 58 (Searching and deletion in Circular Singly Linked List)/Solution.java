 //Searching in Singly Linked List
    public boolean Search(int nodeValue){
        Node tempNode = Head;
        int i = 0;
        while(i<size){
            if(tempNode.value == nodeValue){
                System.out.println("Element found at index :"+i);
                return true;
            }
            tempNode = tempNode.next;
            i++;
        }
        System.out.println("Element Not Found!");
        return false;
    }
    //Deletion from circular Singly Linked List
    public void Delete(int location){
        if(Head == null){
            System.out.println("Circular Singly Linked List is Empty!!");
            return;
        } else if(location == 0) {   //Delete from beginning
            Head = Head.next;
            Tail.next = Head;
            size--;
            if(size == 0){
                Head = null;
                Tail = null;
            }
        }
        else if(location >= size){   //Delete from end
            Node tempNode = Head;
            for(int i=0;i<size-1;i++){
                tempNode=tempNode.next;
                if(tempNode == Head){
                    Tail = Head = null;
                    size--;
                    return;
                }
                tempNode.next = Head;
                Tail = tempNode;
                size--;
            }
        }
        else{                      //Delete a specific node
            Node tempNode = new Node();
            for(int i=0;i<location-1;i++){
                tempNode = tempNode.next;
            }
            tempNode.next = tempNode.next.next;
            size--;
        }
    }
    //Delete Entire Circular Singly Linked List
    public void DeleteCSinglyLinkedList(){
        if(Head == null){
            System.out.println("Linked List not found!");
        }
        Head = Tail = null;
    }

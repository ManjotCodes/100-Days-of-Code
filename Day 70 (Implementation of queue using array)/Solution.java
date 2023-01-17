public class Solution{

    int [] arr;
    int Rear;
    int Front;

    public Day_47_QueueImplementationByArray(int size){
        this.arr = new int[size];
        this.Rear = -1;
        this.Front = -1;
        System.out.println("The Queue is successfully created with size :"+size);
    }
    //isFull to check weather the queue is full or not
    public boolean isFull(){
        if(Rear == arr.length-1){
            return true;
        }
        return false;
    }
    //isEmpty to check weather the queue is empty or not
    public boolean isEmpty(){
        if(Front == -1 || Front == arr.length){
            return true;
        }
        return false;
    }

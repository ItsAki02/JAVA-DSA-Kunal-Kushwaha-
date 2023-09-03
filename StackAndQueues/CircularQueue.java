package StackAndQueues;

public class CircularQueue {
    public int[] data;
    private static final int Default_size = 10;

    protected int end = 0;
    protected int front = 0;
    private int size = 0 ;

    public CircularQueue(){
        this(Default_size);   
     }

     public CircularQueue(int size){
        this.data = new int[size];
     }

     public boolean isFull() {
        return size == data.length;//pointer is at last index
    }

    private boolean isEmpty(){
        return size == 0;//ptr is at last index
    }

    public boolean insert(int item){
        if(isFull()){
            return false;
        }
        data[end++] = item;
        end = end % data.length;
        size++;
        return true;
    }

    public int remove() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty");
        }
        int removed = data[front++];
        front = front % data.length;
        size--;
        return removed;
    }

    public int front() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is Empty");
        }
        return data[front];
    }

    public void display(){
        if (isEmpty()){
            System.out.println("Empty");
            return;
        }
        int i = front;
        do{
            System.out.print(data[i] + "->");
            i++;
            i %= data.length;
        }while(i != end);
        
        System.out.println("END");
    }


}

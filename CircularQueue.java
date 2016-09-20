/**
 *
 * @author Rubas
 */
public class CircularQueue {
    
    private int[] queue;
    
    private int head;
    private int rear;
    
    private int maxSize;
    
    private boolean isFull;
    
    public CircularQueue(int n){
        maxSize = n;
        this.queue = new int[maxSize];
        
        head = 0;
        rear = 0;
        
        isFull = false;
        
    }
    
    public boolean enqueue(int n){
        if(!isFull()){
            queue[rear] = n;
            rear = (rear + 1) % maxSize;
            
            if(rear == head){
                isFull = true;
            }
            
            return true;
        } else {
            System.out.println("Queue full!");
            return false;
        }
    }
    
    public int dequeue(){
        
        if(!isEmpty()){
            int currentHead = head;
            head = (head + 1) % maxSize;
            isFull = false;
            return queue[currentHead];

        } else {
            System.out.println("Queue is empty, can not dequeue");
            return 0;
        }
        
    }
    
    public boolean isFull(){
        return isFull;
    }
    
    public boolean isEmpty(){
        if(isFull == false && head == rear){
            return true;
        } else {
            return false;
        }
    }
}

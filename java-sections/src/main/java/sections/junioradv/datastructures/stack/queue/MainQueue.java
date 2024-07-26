package sections.junioradv.datastructures.stack.queue;

public class MainQueue {
    public static void main(String[] args) {


        Queue myQueue = new Queue(5);
        myQueue.enqueue(4);
        myQueue.enqueue(3);


        //myQueue.printQueue();

        myQueue.dequeue();
        myQueue.dequeue();
        myQueue.dequeue();

        myQueue.printQueue();
    }
}

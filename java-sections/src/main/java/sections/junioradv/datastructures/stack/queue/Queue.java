package sections.junioradv.datastructures.stack.queue;

import sections.junioradv.datastructures.stack.Stack;

public class Queue {

    private Node last;
    private Node first;
    private int lenght;


    public class Node{
        int value;
        Node next;

        public Node(int value){
            this.value = value;
        }
    }


    public Queue(int value){
        Node newNode = new Node(value);
        last = newNode;
        first = newNode;
        lenght = 1;
    }



    public void printQueue(){
        Node temp = first;
        //con este pointer temporal podemos apuntar a la cabeza o head del stack
        //sin comprometer al pointer inicial del stack

        while (temp != null){
            System.out.print(temp.value + " -> \t");
            temp = temp.next;
        }
        System.out.println("null");
    }


    public void getFirst(){
        if(first == null) {
            throw new IllegalStateException("First element is null");
        }else {
            System.out.println("First element: " + first.value);
        }
    }

    public void getLast(){
        if (last == null){
            throw new IllegalStateException("Last element is null");
        }else {

            System.out.println("Last element: " + last.value);
        }
    }

    public void size(){
        System.out.println("Size is: " + lenght);
    }

    public void addFirst(int value){
        Node newNode = first;
    }

    public void addLast(int value){
        Node newNode = last;
    }


    public void enqueue(int value){
        Node newNode = new Node(value);
        if (first == null){
            first = newNode;
            last = newNode;
        }else {
            last.next = newNode;
            last = newNode;
        }
        lenght++;
    }

    public Node dequeue(){
        Node temp = first;
        if (lenght == 0 ) return null;
        if (lenght == 1 ){
            first = null;
            last = null;
        }else {
            first = first.next;
            temp.next = null;
        }
        lenght--;
        return temp;
    }
}

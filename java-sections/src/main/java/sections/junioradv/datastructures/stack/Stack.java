package sections.junioradv.datastructures.stack;

public class Stack {

    private Node top; // mas conocido como puntero
    private int height;



    public class Node{

        int value;
        Node next;

        public Node(int value){
            this.value = value;
        }
    }


    public Stack(int value){
        top = new Node(value);
        height = 1;
        /*Antes la lista estaba vacia, y ahora el primer puntero o pointer esta apuntando a
        * el primer nodo agregado*/
    }


    public void printStack(){
        Node temp = top;
        //con este pointer temporal podemos apuntar a la cabeza o head del stack
        //sin comprometer al pointer inicial del stack

        while (temp != null){
            System.out.print(temp.value + " -> \t");
            temp = temp.next;
        }
        System.out.println();
    }


    public void getTop(){
        System.out.println("Top value: " + top.value);
    }

    public void getHeight(){
        System.out.println("The size is: " + height);
    }

    public void push(int value){
        Node newNode = new Node(value);
        if (height == 0){
            top = newNode;
        }else {
            newNode.next = top;
            top = newNode;
        }
        height++;
    }


    public Node pop(){
        if (height ==0) return null;

        Node temp = top;
        top = top.next;
        temp.next = null;

        return temp;
    }


}

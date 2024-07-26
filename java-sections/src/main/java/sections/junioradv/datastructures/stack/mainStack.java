package sections.junioradv.datastructures.stack;

public class mainStack {
    public static void main(String[] args) {

        Stack myStack = new Stack(4);

        myStack.getHeight();
        myStack.getTop();

        myStack.push(5);
        myStack.push(2);
        myStack.push(100);
        myStack.printStack();

        myStack.getHeight();

        myStack.pop();

        myStack.printStack();
    }
}

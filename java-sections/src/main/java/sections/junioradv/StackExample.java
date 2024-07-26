package sections.junioradv;

public class StackExample {
    public static void main(String[] args) {

        Stack<String> myStack = new Stack<>();

        myStack.push("Hola");
        myStack.push("Como");
        myStack.push("Estas?");

        System.out.println(myStack.toString());
        System.out.println(myStack.size());
    }
}

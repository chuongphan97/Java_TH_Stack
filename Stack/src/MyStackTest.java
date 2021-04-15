public class MyStackTest {
    public static void main(String[] args) {
        MyStack<Integer> myStack = new MyStack<>();
        myStack.push(0);
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        myStack.push(4);
        myStack.push(4);
        myStack.push(4);
        myStack.push(4);
        myStack.push(4);

        myStack.push(4);
        myStack.push(4);
        myStack.push(4);


        for (int i = 0; i < myStack.size; i++) {
            System.out.println(myStack.elements[i]);
        }


    }
}

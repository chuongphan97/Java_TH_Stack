public class MyStack<E> {
    public static int DEFAULT_CAPACITY = 10;
    public int size=0;
    public E[] elements;



    public MyStack() {
        elements = (E[]) new Object[DEFAULT_CAPACITY];
    }

    public MyStack(E[] elements) {
        this.elements = elements;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public boolean isFull(){
        return size == DEFAULT_CAPACITY;
    }

    public void push(E e){
        if (isFull()){
            System.out.println("Stack overflow");
        } else
        elements[size++] = e;

    }

    public E pop(){
        if (isEmpty()) return null;
        else {
            
            return this.elements[--size];
        }
    }

    public int search(E e){
        for (int i = 0; i < size; i++) {
            if (elements[i] == e) return i;
        }
        return -1;
    }

    public E peek(){
        return elements[size-1];
    }


}

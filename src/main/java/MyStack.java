public class MyStack {
    private int[] data;
    private int top;
    private int capacity;

    public static void main(String[] args) {
        MyStack stack = new MyStack(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println(stack.peek());  // 30
        System.out.println(stack.pop());   // 30
        System.out.println(stack.pop());   // 20
        System.out.println(stack.isEmpty()); // false
        System.out.println(stack.pop());   // 10
        System.out.println(stack.isEmpty()); // true
    }

    public MyStack(int size) {
        capacity = size;
        data = new int[capacity];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }

    public void push(int value) {
        if (isFull()) {
            throw new IllegalStateException("스택이 가득 찼습니다.");
        }
        data[++top] = value;
    }

    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("스택이 비어 있습니다.");
        }
        return data[top--];
    }

    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("스택이 비어 있습니다.");
        }
        return data[top];
    }
}

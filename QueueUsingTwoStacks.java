
    import java.util.Stack;

public class QueueUsingTwoStacks {
    private Stack<Integer> stack1; // stack for enqueue operations
    private Stack<Integer> stack2; // stack for dequeue operations

    public QueueUsingTwoStacks() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void enqueue(int element) {
        stack1.push(element);
    }

    public int dequeue() {
        if (stack2.isEmpty()) {
            // transfer elements from stack1 to stack2
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }

    public boolean isEmpty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }

    public static void main(String[] args) {
        QueueUsingTwoStacks queue = new QueueUsingTwoStacks();

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

       while(!queue.isEmpty())
       {
        System.err.println(queue.dequeue());
       }
    }
}
    


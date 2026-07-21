import java.util.*;
class StackUsingQueues {
    public Queue<Integer> queue = new LinkedList<>();

    public void push(int x) {
        queue.add(x);
        for (int i = 1; i < queue.size(); i++)
            queue.add(queue.remove());
    }

    public int pop() {
        return queue.remove();
    }

    public int top() {
        return queue.peek();
    }

    public boolean empty() {
        return queue.isEmpty();
    }
}
class Main {
public static void main(String[] args) {

            StackUsingQueues stack = new StackUsingQueues();

            stack.push(10);
            stack.push(20);
            stack.push(30);

            System.out.println("Top: " + stack.top());      // 30
            System.out.println("Pop: " + stack.pop());      // 30
            System.out.println("Top: " + stack.top());      // 20
            System.out.println("Is Empty: " + stack.empty());// false

            stack.pop();
            stack.pop();

            System.out.println("Is Empty: " + stack.empty());// true
        }
    }

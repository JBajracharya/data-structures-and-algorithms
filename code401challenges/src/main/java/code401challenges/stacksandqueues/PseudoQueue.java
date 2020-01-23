package code401challenges.stacksandqueues;

public class PseudoQueue<T> {
    Node<T> top;
    Stack<T> enqueueStack = new Stack<T>();
    Stack<T> dequeueStack = new Stack<T>();

    public void enqueue(T value) {
//        while (!enqueueStack.isEmpty()) {
//            dequeueStack.push(enqueueStack.pop());
//        }

        while (!dequeueStack.isEmpty()) {
            enqueueStack.push(dequeueStack.pop());
        }
        enqueueStack.push(value);

    }

    public T dequeue() {
        while (!enqueueStack.isEmpty()){
            dequeueStack.push(enqueueStack.pop());
        }
        T result = dequeueStack.pop();
        while (!dequeueStack.isEmpty()){
            enqueueStack.push(dequeueStack.pop());
        }
        return result;
    }

    public String toString() {
        Node<T> currentNode = enqueueStack.top;
        StringBuilder listValues = new StringBuilder();
        while (currentNode != null) {
            listValues.append(currentNode.value).append("->");
            currentNode = currentNode.next;
        }
        return listValues + "FRONT";
    }
}

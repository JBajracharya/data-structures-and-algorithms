package code401challenges.stacksandqueues;

public class PseudoQueue {
    Node top;
    Stack enqueueStack = new Stack();
    Stack dequeueStack = new Stack();

    public void enqueue(int value) {
//        while (!enqueueStack.isEmpty()) {
//            dequeueStack.push(enqueueStack.pop());
//        }

        while (!dequeueStack.isEmpty()) {
            enqueueStack.push(dequeueStack.pop());
        }
        enqueueStack.push(value);

    }

    public int dequeue() {
        while (!enqueueStack.isEmpty()){
            dequeueStack.push(enqueueStack.pop());
        }
        int result = dequeueStack.pop();
        while (!dequeueStack.isEmpty()){
            enqueueStack.push(dequeueStack.pop());
        }
        return result;
    }

    public String toString() {
        Node currentNode = enqueueStack.top;
        StringBuilder listValues = new StringBuilder();
        while (currentNode != null) {
            listValues.append(currentNode.value).append("->");
            currentNode = currentNode.next;
        }
        return listValues + "FRONT";
    }
}

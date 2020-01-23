package code401challenges.stacksandqueues;

public class Stack<T> {
    Node<T> top;

    public void push(T value) {
        if(this.top == null) {
            this.top = new Node<T>(value);
            this.top.next = null;
        } else {
            this.top = new Node<T>(value, this.top);
        }
    }

    public T pop () {
        Node<T> temp = this.top;
        this.top = top.next;
//        if(top.next  == null){
//            throw new EmptyStackException();
//        }
        temp.next = null;

        return temp.value;
    }

    public Node<T> peek() {
        return top;
    }

    public boolean isEmpty() {
        return peek() == null;
    }

    public String toString() {
        Node<T> currentNode = top;
        StringBuilder listValues = new StringBuilder();
        while (currentNode != null) {
            listValues.append(currentNode.value).append("->");
            currentNode = currentNode.next;
        }
        return listValues + "NULL";
    }
}

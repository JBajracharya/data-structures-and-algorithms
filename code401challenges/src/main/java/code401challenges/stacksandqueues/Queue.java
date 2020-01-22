package code401challenges.stacksandqueues;

import java.util.NoSuchElementException;

public class Queue<T> {
    Node<T> front;
    Node<T> rear;

    public void enqueue(T value) {
        if(this.front == null) {
            this.front = new Node<T>(value);
            this.rear = this.front;
        } else {
            this.rear.next = new Node<T>(value, null);
            this.rear = this.rear.next;
        }
    }

    public T dequeue() {
        if(this.front == null) {
            this.rear = null;
            throw new NoSuchElementException();
        } else {
            Node<T> temp = front;
            front = front.next;
            temp.next = null;
            return temp.value;
        }

    }

    public T peek() {
        return front.value;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public String toString() {
        Node currentNode = front;
        StringBuilder listValues = new StringBuilder();
        while (currentNode != null) {
            listValues.append(currentNode.value).append("->");
            currentNode = currentNode.next;
        }
        return listValues + "NULL";
    }
}

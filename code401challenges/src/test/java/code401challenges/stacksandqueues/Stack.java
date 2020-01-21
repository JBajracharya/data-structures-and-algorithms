package code401challenges.stacksandqueues;

public class Stack {
    Node top;

    public void push(int value) {
        if(this.top == null) {
            this.top = new Node(value);
            this.top.next = null;
        } else {
            this.top = new Node(value, this.top);
        }
    }

    public int pop () {
        Node temp = this.top;
        this.top = top.next;
//        if(top.next  == null){
//            throw new EmptyStackException();
//        }
        temp.next = null;

        return temp.value;
    }

    public Node peek() {
        return top;
    }

    public boolean isEmpty() {
        return peek() == null;
    }

    public String toString() {
        Node currentNode = top;
        StringBuilder listValues = new StringBuilder();
        while (currentNode != null) {
            listValues.append(currentNode.value).append("->");
            currentNode = currentNode.next;
        }
        return listValues + "NULL";
    }
}

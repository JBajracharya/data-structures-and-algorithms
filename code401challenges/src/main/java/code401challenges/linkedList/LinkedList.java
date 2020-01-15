package code401challenges.linkedList;

////////////////////// Challenge 5 /////////////////////////////

public class LinkedList {
    Node head;

    // insert new node at the beginning of the node.
    public void insert(int value) {
        if (this.head == null) {
            this.head = new Node(value);
            this.head.next = null;
        } else {
            this.head = new Node(value, this.head);
        }
    }

    public boolean includes(int value) {
        Node currentNode = head;
        while (currentNode.next != null) {
            if (currentNode.value == value) {
                return true;
            }
            currentNode = currentNode.next;
        }
        return false;
    }

    public String toString() {
        Node currentNode = head;
        String listValues = "";
        while (currentNode != null) {
            listValues += "{" + currentNode.value + "}" + "->";
            currentNode = currentNode.next;
        }

        System.out.println(listValues+ "NULL");

        return listValues + "NULL";
    }

    ////////////////////// Challenge 6 /////////////////////////////
    public void append(int value) {
        if (this.head == null) {
            this.head = new Node(value);
            this.head.next = null;
        } else {
            Node currentNode = head;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = new Node(value, null);
        }
    }

    public void insertBefore(int value, int newValue) {
        Node currentNode = this.head;
        while (currentNode.next.value != value) {
            currentNode = currentNode.next;
        }

        Node temp = currentNode.next;
        currentNode.next = new Node(newValue, temp);
    }

    public void insertAfter(int value, int newValue) {
        Node currentNode = this.head;
        while (currentNode.value != value) {
            currentNode = currentNode.next;
        }
        Node temp = currentNode.next;
        currentNode.next = new Node(newValue, temp);

    }

}

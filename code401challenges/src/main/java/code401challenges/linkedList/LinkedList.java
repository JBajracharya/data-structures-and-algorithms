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

    ////////////////////// Challenge 6 /////////////////////////////

    // node value the the kth position from the end of the list
    public int kthFromEnd(int positionFromEnd) {
        int position = getBiginningPos(positionFromEnd);
        Node currentNode = this.head;

        for (int i = 1; i < position; i++) {
            currentNode = currentNode.next;
        }
        int valueAtKthPos = currentNode.value;
        return valueAtKthPos;
    }

    public int getBiginningPos(int positionFromEnd) {
        Node currentNode = this.head;
        int counter = 0;
        while(currentNode != null) {
            counter++;
            currentNode = currentNode.next;
        }
//        System.out.println("11111" + counter);
        if(counter < positionFromEnd) {
            throw new IndexOutOfBoundsException("Index " + positionFromEnd + " is outside linked list range");
        }
        int posFromBeginning = counter - positionFromEnd;
        return posFromBeginning;
    }

}

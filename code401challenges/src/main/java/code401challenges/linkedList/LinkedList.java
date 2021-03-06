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
        StringBuilder listValues = new StringBuilder();
        while (currentNode != null) {
            listValues.append("{").append(currentNode.value).append("}").append("->");
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

    ////////////////////// Challenge 7 /////////////////////////////

    // node value the the kth position from the end of the list
    public int kthFromEnd(int positionFromEnd) {
        int position = getBiginningPos(positionFromEnd);
        Node currentNode = this.head;

        for (int i = 1; i < position; i++) {
            currentNode = currentNode.next;
        }
        return currentNode.value;
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
        return counter - positionFromEnd;
    }

    ////////////////////// Challenge 7 /////////////////////////////
    public static LinkedList mergeLists(LinkedList one , LinkedList two) {
        if(one.head == null) {
            return two;
        } else if(two.head == null) {
            return one;
        }
        Node currentNode1 = one.head;
        Node currentNode2 = two.head;

        while (currentNode1 != null && currentNode2 != null) {
            Node temp1 = currentNode1.next;
            Node temp2 = currentNode2.next;
            if(currentNode1.next != null) {
                currentNode2.next = currentNode1.next;
            }
            currentNode1.next = currentNode2;
            currentNode1 = temp1;
            currentNode2 = temp2;
        }
        return one;
    }

}

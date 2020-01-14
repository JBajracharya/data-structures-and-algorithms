package code401challenges.linkedList;

public class LinkedList {
    Node head;

    // insert new node at the beginning of the node.
    public void insert( int value) {
        if(this.head == null) {
            this.head = new Node(value);
            this.head.next = null;
        } else {
            this.head = new Node(value, this.head);
        }
    }

    public boolean includes(int value) {
        Node currentNode = head;
        while(currentNode.next != null) {
            if(currentNode.value == value) {
                return true;
            }
            currentNode = currentNode.next;
        }
        return false;
    }

    public String printValues() {
        Node currentNode = head;
        String listValues = "";
        while (currentNode.next != null) {
            listValues += "{" + currentNode.value + "}" + "->";
            currentNode = currentNode.next;
        }
        int lastValue = currentNode.value;
        currentNode.next = head;
        System.out.println(listValues + "{" + lastValue + "}" + "->" + "NULL");

        return listValues + "{" + lastValue + "}" + "->" + "NULL";
    }
}

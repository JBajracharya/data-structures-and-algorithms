package code401challenges.linkedList;

public class LinkedList {
    Node head;

    public void insert( int value) {
        Node node = new Node();
        node.value = value;
        node.next = null;

        if(head == null) {
            head = node;
        } else {
            Node currentNode = head;

            while(currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = node;
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

    public String PrintValues() {
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

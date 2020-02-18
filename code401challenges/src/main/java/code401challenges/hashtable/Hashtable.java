package code401challenges.hashtable;

import java.util.ArrayList;

public class Hashtable<K, V> {

    // source: https://www.geeksforgeeks.org/implementing-our-own-hash-table-with-separate-chaining-in-java/

    //bucket array stores array of chains
    private ArrayList<HashNode<K, V>> bucketArray;

    //current capacity of arrayList
    private int numBuckets;

    //current size of the array
    private int size;

    public Hashtable() {
        // initialize fields
        bucketArray = new ArrayList<>();
        numBuckets = 10;
        size = 0;

        //create empty chains
        for (int i = 0; i < numBuckets; i++) {
            bucketArray.add(null);
        }
    }

    public int size () {
        return size;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    // hash method gets the index of the bucket in the arraylist
    public int hash(K key) {
        int hashCode = key.hashCode();
        int index = Math.abs(hashCode % numBuckets);
        return index;
    }

    // method to get the value of a key
    public V get (K key) {
        // find head of chain for given key
        int bucketIndex = hash(key);
        HashNode<K, V> head = bucketArray.get(bucketIndex);

        // search key in chain
        //loop through the linked list to get the value
        while (head != null) {
            if(head.key.equals(key)) {
                return head.value;
            }
            head = head.next;
        }

        // if key not found
        return null;
    }

    public void add(K key, V value) {

        //finding head of chain for given key
        int bucketIndex = hash(key);
        HashNode<K, V> head = bucketArray.get(bucketIndex);

        // check if key is already present
        while (head != null) {
            if(head.key.equals(key)) {
                head.value = value;
                return;
            }

            head = head.next;
        }

        // inserting key in chain
        size++;
        head = bucketArray.get(bucketIndex);
        HashNode<K, V> newNode = new HashNode<K, V>(key, value);
        newNode.next = head;
        bucketArray.set(bucketIndex, newNode);

        // double hashtable size if the load factor goes beyond limit
        if((1 * size)/numBuckets >= 0.7) {
            ArrayList<HashNode<K, V>> temp = bucketArray;
            bucketArray = new ArrayList<>();
            numBuckets = 2 * numBuckets;
            size = 0;

            for (int i = 0; i < numBuckets; i++) {
                bucketArray.add(null);
            }

            for (HashNode<K, V> headNode : temp) {
                while (headNode != null) {
                    add(headNode.key, headNode.value);
                    headNode = headNode.next;
                }
            }
        }
    }

    public boolean contains(K key) {
        //finding head of chain for given key
        int bucketIndex = hash(key);
        HashNode<K, V> head = bucketArray.get(bucketIndex);

        // check if key is already present
        while (head != null) {
            if(head.key.equals(key)) {
                return true;
            }

            head = head.next;
        }
        return false;
    }

}

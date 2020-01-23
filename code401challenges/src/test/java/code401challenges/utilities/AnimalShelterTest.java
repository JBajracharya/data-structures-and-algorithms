package code401challenges.utilities;

import org.junit.Test;


public class AnimalShelterTest {
    AnimalShelter bod = new AnimalShelter();
//    Queue<Cat> catQueue = new LinkedList<>();
//    Queue<Dog> dogQueue = new LinkedList<>();

    @Test
    public void testEnqueue() {
//        Queue<Cat> catQueue = new LinkedList<>();
        Cat cat1 = new Cat("Lucy");

        bod.enqueue(cat1);
        System.out.println(bod.dequeue("cat").name);
    }

    @Test
    public void dequeue() {


    }
}
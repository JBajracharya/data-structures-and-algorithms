package code401challenges.utilities;


import java.util.LinkedList;
import java.util.Queue;

public class AnimalShelter{
    Queue<Cat> catQueue = new LinkedList<>();
    Queue<Dog> dogQueue = new LinkedList<>();

    public void enqueue(Cat cat) {
        catQueue.add(cat);
    }

    public void enqueue(Dog dog) {
        dogQueue.add(dog);
    }

    public Animal dequeue(String animal) {
        if(animal.equals("dog")) {
            return dogQueue.remove();
        } else if(animal.equals("cat")) {
            return catQueue.remove();
        } else {
            return null;
        }
    }
}

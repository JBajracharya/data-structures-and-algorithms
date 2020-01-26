package code401challenges.utilities;


import java.util.LinkedList;
import java.util.NoSuchElementException;
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

    public String dequeue(String animal) {
        String result = "";
        try {
            if(animal.equals("dog")) {
                dogQueue.remove();
            } else if(animal.equals("cat")) {
                catQueue.remove();
            } else {
                result = null;
            }
        } catch (NoSuchElementException e) {
            result =  ("\"" + animal + "\"" + " is not available");
        }
        return result;
    }

    public String dequeue() {
        String result = "";
        try {
            if(catQueue.element().entryNumber > dogQueue.element().entryNumber){
                dogQueue.remove();
            } else if(catQueue.element().entryNumber < dogQueue.element().entryNumber){
                catQueue.remove();
            }
        }catch (NoSuchElementException e){
            result =  "No animal is available";
        }
        return result;
    }

    public String toString() {
        int queueSize = catQueue.size() + dogQueue.size();
        StringBuilder animalList = new StringBuilder();

        for (int i = 1; i <= queueSize; i++) {
            if(catQueue.element().entryNumber > dogQueue.element().entryNumber){
                Dog temp = dogQueue.element();
                temp.entryNumber = temp.entryNumber + queueSize + 100;
                animalList.append(dogQueue.element().name).append(", ");
                dogQueue.add(temp);
                dogQueue.remove();

            } else if(catQueue.element().entryNumber < dogQueue.element().entryNumber) {
                Cat temp = catQueue.element();
                temp.entryNumber = temp.entryNumber + queueSize + 100;
                animalList.append(catQueue.element().name).append(", ");
                catQueue.add(temp);
                catQueue.remove();


            }
        }
        return animalList.toString();
    }
}

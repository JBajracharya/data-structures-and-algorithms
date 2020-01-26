package code401challenges.utilities;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class AnimalShelterTest {


    @Test
    public void testEnqueue() {
        AnimalShelter shelter = new AnimalShelter();
        Cat cat1 = new Cat("Lucy", 1);
        Cat cat2 = new Cat("Kity", 2);
        Dog dog1 = new Dog("Shiro", 3);
        Cat cat3 = new Cat("Ami", 4);
        Dog dog2 = new Dog("Jackie", 5);
        Dog dog3 = new Dog("Shio", 6);

        shelter.enqueue(cat1);
        shelter.enqueue(cat2);
        shelter.enqueue(dog1);
        shelter.enqueue(cat3);
        shelter.enqueue(dog2);
        shelter.enqueue(dog3);
        String expected = "Lucy, Kity, Shiro, Ami, Jackie, Shio, ";
        String actual = shelter.toString();
        assertEquals(expected, actual);
    }

    @Test
    public void dequeue() {
        AnimalShelter shelter = new AnimalShelter();
        Cat cat1 = new Cat("Lucy", 1);
        Cat cat2 = new Cat("Kity", 2);
        Dog dog1 = new Dog("Shiro", 3);
        Cat cat3 = new Cat("Ami", 4);
        Dog dog2 = new Dog("Jackie", 5);
        Dog dog3 = new Dog("Shio", 6);

        shelter.enqueue(cat1);
        shelter.enqueue(cat2);
        shelter.enqueue(dog1);
        shelter.enqueue(cat3);
        shelter.enqueue(dog2);
        shelter.enqueue(dog3);


        shelter.dequeue("dog");

        String expected = "Lucy, Kity, Ami, Jackie, Shio, ";
        String actual = shelter.toString();
        assertEquals(expected, actual);
    }
    @Test
    public void onlyDogTest(){
        AnimalShelter shelter = new AnimalShelter();
        Dog dog1 = new Dog("Shiro", 3);
        Dog dog2 = new Dog("Jackie", 5);
        Dog dog3 = new Dog("Shio", 6);
        shelter.enqueue(dog1);
        shelter.enqueue(dog2);
        shelter.enqueue(dog3);

        String expected = "\"cat\" is not available";
        String actual = shelter.dequeue("cat");

        assertEquals(expected, actual);
    }

    @Test
    public void noPreference() {
        AnimalShelter shelter = new AnimalShelter();
        Cat cat1 = new Cat("Lucy", 1);
        Cat cat2 = new Cat("Kity", 2);
        Dog dog1 = new Dog("Shiro", 3);
        Cat cat3 = new Cat("Ami", 4);
        Dog dog2 = new Dog("Jackie", 5);
        Dog dog3 = new Dog("Shio", 6);

        shelter.enqueue(cat1);
        shelter.enqueue(cat2);
        shelter.enqueue(dog1);
        shelter.enqueue(cat3);
        shelter.enqueue(dog2);
        shelter.enqueue(dog3);

        shelter.dequeue();

        String expected = "Kity, Shiro, Ami, Jackie, Shio, ";
        String actual = shelter.toString();
        assertEquals(expected, actual);
    }


}
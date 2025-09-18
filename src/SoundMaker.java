// SoundMaker.java
public class SoundMaker {
    public void makeDogSound(Dog dog) {
        System.out.print(dog.getName() + " says: ");
        dog.makeSound();
    }


    public void makeCatSound(Cat cat) {
        System.out.print(cat.getName() + " says: ");
        cat.makeSound();
    }


    public void makeChickenSound(Chicken chicken) {
        System.out.print(chicken.getName() + " says: ");
        chicken.makeSound();
    }
}

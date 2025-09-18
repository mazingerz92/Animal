// AnimalSoundsApp.java
public class AnimalSoundsApp {
    public static void main(String[] args) {
        // Create a Dog object
        Dog bob = new Dog();
        bob.setName("Bob");


        // Create a Cat object
        Cat misu = new Cat();
        misu.setName("Misu");


        // Create a Chicken object
        Chicken piyo = new Chicken();
        piyo.setName("Piyo");


        // Create a SoundMaker object
        SoundMaker soundMachine = new SoundMaker();


        // Make the animals sound
        soundMachine.makeDogSound(bob);
        soundMachine.makeCatSound(misu);
        soundMachine.makeChickenSound(piyo);
    }
}

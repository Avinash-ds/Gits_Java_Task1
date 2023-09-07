package methodoverriding;

// Parent class - Animal with a sound
class Animal {
    void shout() {
        System.out.println("errrrrrrrrr");
    }
}

// Child class with a Different sound - Cow overrides animal
class Cow extends Animal {
    void shout() {
        System.out.println("moooow");
    }
}

// Run main method - Different sound for animal and cow
public class ReplaceSound {
    public static void main(String[] args) {

        Animal commonAnimal = new Animal();
        Cow aCow = new Cow();

        commonAnimal.shout();
        aCow.shout();
    }
}

// Method override - child can adopt parent feautures with a diffrent type.

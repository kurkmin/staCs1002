import cs1002.people.*; //so we can create Person and MultiPersonDisplay objects
import java.awt.Color; //so we can use colors if we want to

public class W01Exercise2 {
    public static void main(String[] args) {
        // create two people
        Person person = new Person("Bob", 165, 2000, 1, 1);
        Person person2 = new Person("Sumin", 180, 1997, 1, 20);

        // add some clothes
        person.wearRainbowTop();
        person.wearRainbowShoes();
        person.wearRainbowGloves();
        person.wearRainbowTrousers();

        person2.wearRainbowTop();
        person2.wearRainbowShoes();
        person2.wearRainbowGloves();
        person2.wearRainbowTrousers();

        // display the two people
        MultiPersonDisplay displayer = new MultiPersonDisplay();
        displayer.add(person);
        displayer.add(person2);
    }
}
import cs1002.people.*; //so we can create Person and MultiPersonDisplay objects
import java.awt.Color; //so we can use colors if we want to

public class W01Exercise2 {
    public static void main(String[] args) {
        //TODO: Change the parameter values to match your own name, height & date of birth
        //create a Person object with name Bob, height 165cm, and birthday 1st January 2000
        Person person = new Person("Bob", 165, 2000, 1, 1);

        //TODO: Add some clothes to your person
        //Your Java code goes here

        //display the person
        person.display();
    }
}
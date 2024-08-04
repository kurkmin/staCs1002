import java.util.Scanner;

public class W04Exercise1 {

    Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
    
        W04Exercise1 exercises = new W04Exercise1();
        
        exercises.runExercises();
    }
    
    public void runExercises() {

        System.out.println("Enter exercise number:");
        int number = reader.nextInt();
        
        if (number == 1) exercise1();
        else if (number == 2) exercise2();
        else if (number == 3) exercise3();
        else if (number == 4) exercise4();
        else if (number == 5) exercise5();
        else System.out.println("unknown exercise");
    }

    public void exercise1() {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter number:");
        int number = reader.nextInt();
        if (number < 0) System.out.printf("%s is negative", number);
    }

    public void exercise2() {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter number:");
        int number = reader.nextInt();
        if (number >= 0) System.out.printf("%s is non-negative", number);
    }

    public void exercise3() {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter number:");
        int number = reader.nextInt();
        if (number > 0) {
            System.out.printf("%s is non-negative", number);
        }
        
        else if (number == 0) {
            System.out.printf("%s is zero", number);
        }
        
        else {
            System.out.printf("%s is negative", number);
        }
    }

    public void exercise4() {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter animal:");
    
        // This is needed in order to clean up after the previous test.
        String animal = reader.nextLine();
        
        // Add new code here.
        switch (animal) {
            case "cat":
            case "whale":
                System.out.println("mammal");
                break;
            
            case "shark":
                System.out.println("fish");
                break;
            default: 
                System.out.println("don't know");
        }

    }

    public void exercise5() {
        System.out.println("Enter string 1:");
        Scanner reader1 = new Scanner(System.in);
        // This is needed in order to clean up after the previous test.
        String s1 = reader1.nextLine();
        System.out.println("Enter string 2");
        Scanner reader2 = new Scanner(System.in);
        String s2 = reader2.nextLine();
        // Add new code here.
        if (s1.contains(s2)) {
            System.out.printf("%s does contain %s, starting at position %s", s1, s2, s1.indexOf(s2));
        }
        else {
            System.out.printf("%s does not contain %s", s1, s2);
        }   
        
    }
}

import java.util.Scanner;

public class W05Exercise1 {

    Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
    
        W05Exercise1 exercises = new W05Exercise1();
        
        exercises.runExercises();
    }
    
    public void runExercises() {

        System.out.println("Enter exercise number:");
        int number = reader.nextInt();
        
        switch(number) {
        	case 1: exercise1(); break;
            case 2: exercise2(); break;
            case 3: exercise3(); break;
            case 4: exercise4(); break; 
            case 5: exercise5(); break;
            case 6: exercise6(); break; 
            // case 7: exercise7(); break;
            case 8: exercise8(); break;
            case 9: exercise9(); break;
        	default: System.out.println("unknown exercise");

            
        }
    }

    public void exercise1() {
        System.out.println("Enter upper bound:");
        int userInt = reader.nextInt();
        for (int i=0; i<=userInt; i++) {
            System.out.println(i);
        }
    }

    public void exercise2() {
        System.out.println("Enter upper bound:");
        int userInt = reader.nextInt();
        int i = 0;
        while (i <= userInt) {
            System.out.println(i);
            i = i + 1;
        }
    
    }

    public void exercise3() {
        System.out.println("Enter lower bound:");
        int userLowerInt = reader.nextInt();
        System.out.println("Enter upper bound:");
        int userUpperInt = reader.nextInt();
        for (int i=userLowerInt; i<=userUpperInt; i++) {
            System.out.println(i);
        }
        
    }

    public void exercise4() {
        System.out.println("Enter lower bound:");
        int userLowerInt = reader.nextInt();
        System.out.println("Enter upper bound:");
        int userUpperInt = reader.nextInt();
        for (int i=userLowerInt; i<=userUpperInt; i+=2) {
            System.out.println(i);
        }
    }

    public void exercise5() {
        System.out.println("Enter lower bound:");
        int userLowerInt = reader.nextInt();
        System.out.println("Enter upper bound:");
        int userUpperInt = reader.nextInt();
        for (int i=userLowerInt; i<=userUpperInt; i*=10) {
            System.out.println(i);
        }
    }

    public void exercise6() {
        System.out.println("Enter lower bound:");
        int userLowerInt = reader.nextInt();
        System.out.println("Enter upper bound:");
        int userUpperInt = reader.nextInt();
        for (int i=userUpperInt; i>=userLowerInt; i-=3) {
            System.out.println(i);
        }
    }

    // public void exercise7() {
    //     System.out.println("Enter sequence length:");
    //     int userSeq = reader.nextInt();
    //     for (int i=0; i<=userSeq; i++) {
    //         if (i < userSeq) {
    //             println($("x").repeat(i) + ", ");
    //         }
    //         else {
    //             println($("x").repeat(i));
    //         }
            
    //     }
    // }

    public void exercise8() {
        System.out.println("Enter number:");
        int userInt = reader.nextInt();
        while (userInt != -1) {
            
            for (int i = 0; i < 2; i++) {
                System.out.println(userInt);
            }

            System.out.println("Enter number:");
            int userLoopInt = reader.nextInt();
            userInt = userLoopInt;
        }
    }

    public void exercise9() {
        System.out.println("Enter string:");
        String userInput = reader.next();
        while (!userInput.equals("quit")) {
            System.out.println(userInput);
            System.out.println("Enter string:");
            String userLoopInput = reader.next();
            userInput = userLoopInput;
        }
    }

    public void exercise10() {
    
    }

    public void exercise11() {
    
    }
}

import java.util.Scanner; 

public class W03Exercises2 {
    public static void main(String[] args) {
        Mug mug3 = new Mug("Standard", 90, 80); 
        Mug mug4 = new Mug("Small", 80, 70); 

        // creates user mug by asking type, height, width of the mug
        // Scanner reader1 = new Scanner(System.in);
        // System.out.println("What is the type of your mug?");
        // String mugType = reader1.nextLine();
        // Scanner reader2 = new Scanner(System.in);
        // System.out.println("What is the height of your mug?");
        // int mugHeight = reader2.nextInt();
        // Scanner reader3 = new Scanner(System.in);
        // System.out.println("What is the width of your mug?");
        // int mugWidth = reader3.nextInt();
        // Mug userMug = new Mug(mugType, mugHeight, mugWidth);

        // ask user how many cups of coffee he/she drinks
        // it gives total litres of coffee the user drinks 
        // and gives the maximum number of marshmallow it can be sweetened
        Scanner userReader1 = new Scanner(System.in);
        System.out.printf("How many '%s' cups of coffee do you drink per day?%n", mug3.getName());
        int userCups1 = userReader1.nextInt();
        double totalLitres = userCups1 * mug3.getVolume();
        int totalMallows = userCups1 * mug3.getMarshmallowLimit();
        System.out.printf("You drink %.3fl of coffee per day. ", totalLitres);
        System.out.printf("If you sweetened all your drinks, you would have %d marshmallows per day.%n", totalMallows);

        
    }
}
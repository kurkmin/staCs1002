import java.util.Scanner;

public class W03Exercises2 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Mug mug3 = new Mug("Standard", 90, 80);
        Mug mug4 = new Mug("Small", 80, 70);

        // creates user mug by asking type, height, width of the mug
        System.out.println("What is the type of your mug?");
        String mugType = reader.nextLine();
        System.out.println("What is the height of your mug?");
        int mugHeight = reader.nextInt();
        System.out.println("What is the width of your mug?");
        int mugWidth = reader.nextInt();
        Mug userMug = new Mug(mugType, mugHeight, mugWidth);

        // ask user how many cups of coffee he/she drinks
        // it gives total litres of coffee the user drinks
        // and gives the maximum number of marshmallow it can be sweetened
        System.out.printf("How many '%s' cups of coffee do you drink per day?%n", mug3.getName());
        int userCups1 = reader.nextInt();
        double totalLitres = userCups1 * mug3.getVolume();
        int totalMallows = userCups1 * mug3.getMarshmallowLimit();
        System.out.printf("You drink %.3fl of coffee per day. ", totalLitres);
        System.out.printf("If you sweetened all your drinks, you would have %d marshmallows per day.%n", totalMallows);

    }
}
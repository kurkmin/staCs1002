import java.util.Scanner;

public class W02Exercise1 {
    public static void main(String[] args) {
        // declare a variable to store the price of a burger
        Double burgerPrice = 3.5;
        System.out.println(burgerPrice);

        // Ask user to set the price for a burger
        // here we use nextDouble method instead of nextLine method
        // as our burger prcie consists of not string but floating number
        System.out.println("what is your burger price?");
        Scanner reader = new Scanner(System.in);
        Double burgerPrice0 = reader.nextDouble();
        System.out.println("the burger price is " + burgerPrice0);

        // To calculate the average price of three different burgers
        // Ask user to set the prices for the burgers
        System.out.println("what is your first burger price?");
        Scanner reader1 = new Scanner(System.in);
        Double burgerPrice1 = reader1.nextDouble();

        System.out.println("what is your second burger price?");
        Scanner reader2 = new Scanner(System.in);
        Double burgerPrice2 = reader2.nextDouble();

        System.out.println("what is your third burger price?");
        Scanner reader3 = new Scanner(System.in);
        Double burgerPrice3 = reader3.nextDouble();

        double averagePrice = (burgerPrice1 + burgerPrice2 + burgerPrice3) / 3;
        System.out.println(averagePrice);

    }
}
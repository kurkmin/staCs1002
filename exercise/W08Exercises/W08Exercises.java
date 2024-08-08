public class W08Exercises {
    public static void main(String[] args) {
        // W03-1-6: Test the Mug class
        Mug mug1 = new Mug("Standard", 90, 80);
        Mug mug2 = new Mug("Small", 80, 70);
        Mug mug3 = new Mug("Big", 200, 200);
        Drink drink1 = new Drink("Iced tea", 5, false, mug1);
        Drink drink2 = new Drink("Espresso", 3, mug2);
        Drink drink3 = new Drink("Americano", 4, mug3);

        // mug1.print();
        // mug2.print();

        // mug2.setHeight(70);
        // mug2.setWidth(75);

        // mug1.print();
        // mug2.print();

        drink3.print();

        drink3.setName("latte");
        drink3.setPrice(5);
        drink3.setMug(mug1);

        // drink1.print();
        // drink2.print();

        // ! check output so that we get mug information
        drink3.print();

    }
}

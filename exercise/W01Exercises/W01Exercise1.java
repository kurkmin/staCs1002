import cs1002.burgers.*; //so we can create Burger and MultiBurgerDisplay objects

public class W01Exercise1 {
    public static void main(String[] args) {
        // create a Burger object with no name or price
        Burger burger = new Burger();

        // TODO: Add some ingredients to the burger
        burger.addBottomBun();
        burger.addPatty();
        burger.addCheese();
        burger.addLettuce();
        burger.addTomato();
        burger.addTopBun();

        // display the burger
        burger.display();
    }
}
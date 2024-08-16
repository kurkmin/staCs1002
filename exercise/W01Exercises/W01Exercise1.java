import cs1002.burgers.*; //so we can create Burger and MultiBurgerDisplay objects

public class W01Exercise1 {
    public static void main(String[] args) {
        // create a Burger object with no name or price
        Burger burger = new Burger();

        // create a cheeseburger
        burger.addBottomBun();
        burger.addPatty();
        burger.addCheese();
        burger.addLettuce();
        burger.addTomato();
        burger.addTopBun();

        // add its name and price;
        burger.setName("cheeseburger");
        burger.setPrice(3);

        // create a hamburger with price 2
        Burger burger2 = new Burger("hamburger", 2);
        burger2.addBottomBun();
        burger2.addPatty();
        burger2.addLettuce();
        burger2.addTomato();
        burger2.addTopBun();

        // display the cheese burger
        burger.display();

        // display the cheeseburger and hamburger
        MultiBurgerDisplay displayer = new MultiBurgerDisplay();
        displayer.add(burger);
        displayer.add(burger2);

    }
}
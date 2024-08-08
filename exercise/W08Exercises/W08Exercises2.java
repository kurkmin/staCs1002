public class W08Exercises2 {
    public static void main(String[] args) {
        CoffeeShop coffeeshop1 = new CoffeeShop("WestPoint", "Glasgow");
        CoffeeShop coffeeshop2 = new CoffeeShop("Cafe In the Oval", "Edinburgh");
        Mug mug1 = new Mug("Standard", 90, 80);
        Mug mug2 = new Mug("Small", 80, 70);
        Drink drink1 = new Drink("Americano", 4, mug1);
        Drink drink2 = new Drink("Iced tea", 5, false, mug2);

        coffeeshop1.setDrinks(drink1);
        coffeeshop1.setDrinks(drink1);
        coffeeshop2.setDrinks(drink2);

        // ! why the ouputs are following?:
        // [LDrink;@7344699f
        // [LDrink;@6b95977
        System.out.println(coffeeshop1.getDrinks());
        System.out.println(coffeeshop2.getDrinks());
    }
}

public class CoffeeShop {
    private String name;
    private String address;
    private int starRating;
    private Drink[] drinks = new Drink[10];

    // ! how to create total revenue for all coffeeshops
    public static double totalRevenue = 0;

    // getters

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getRating() {
        return starRating;
    }

    public Drink[] getDrinks() {
        return drinks;
    }

    public Drink getDrink(int menuNumber) {
        menuNumber -= 1;
        if (menuNumber >= 0 && menuNumber < 9) {
            Drink drink = drinks[menuNumber];
            return drink;
        } else {
            return null;
        }

    }

    // setters for name and address

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // setters drinks(array)
    public void setDrinks(Drink drink, int menuNumber) {
        menuNumber -= 1;
        if (menuNumber >= 0 && menuNumber <= 10) {
            drinks[menuNumber] = drink;
        }
    }

    public void setDrinks(Drink drink) {
        for (int i = 0; i < drinks.length; i++) {
            if (drinks[i] == null) {
                drinks[i] = drink;
                return;
            }

        }
    }

    // we do not include star rating drinks as parameters for constructor
    public CoffeeShop(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public void plusStarRating() {
        if (starRating < 5 && starRating >= 0) {
            starRating += 1;
        }

    }

    public void minusStarRating() {
        if (starRating < 5 && starRating >= 0) {
            starRating -= 1;
        }
    }

    public void printMenu() {
        for (int i = 0; i < drinks.length; i++) {
            if (drinks[i] != null) {
                System.out.println(drinks[i]);
            }

        }
    }

    public void print() {
        System.out.println(name + ", " + address + " " + "★".repeat(starRating) + "☆".repeat(5 - starRating));
    }

    public void sellDrink(int menuNumber) {
        menuNumber -= 1;
        if (menuNumber >= 0 && menuNumber <= drinks.length && drinks[menuNumber] != null) {
            double drinkPrice = drinks[menuNumber].getPrice();
            totalRevenue += drinkPrice;
            // totalSales += (drinks[index - 1] != null) ? drinks[index - 1].getPrice() : 0.0;
        }
        }
    }

}

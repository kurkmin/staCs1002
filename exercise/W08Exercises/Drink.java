public class Drink {
    private String name;
    private double price;
    private final boolean isCaffeinated;
    private Mug mug;

    // Constructors
    public Drink(String name, double price, boolean isCaffeinated, Mug mug) {
        this.name = name;
        this.price = price;
        this.isCaffeinated = isCaffeinated;
        this.mug = mug;
    }

    public Drink(String name, double price, Mug mug) {
        this(name, price, true, mug);
    }

    // getters
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public boolean isCaffeinated() {
        return isCaffeinated;
    }

    public Mug getMug() {
        return mug;
    }

    // setters only for name, price and mug

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setMug(Mug mug) {
        this.mug = mug;
    }

    // final field cannot be assigned after its initialisation
    // private void setCaffeination(Boolean caffeination) {
    // this.CAFFEINATION = caffeination;
    // }

    public void print() {
        System.out.println(name + " " + price + " " + isCaffeinated + " " + mug);
    }
}

public class Greeter {
    public Greeter() {

    }

    public void sayHello() {
        System.out.println("hello!");
    }

    public static void main(String[] args) {
        String message = "hellllloooo";
        // String otherMessage = message.toUpperCase();
        System.out.println(message);

        Greeter greet = new Greeter();
        greet.sayHello();
    }
}

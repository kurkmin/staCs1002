public class W03Exercises1 {
    public static void main(String[] args) {
        Mug mug1 = new Mug("Standard", 80, 90); 
        Mug mug2 = new Mug("Small", 70, 80); 
        mug1.setHeight(90);
        mug1.setWidth(100);
        mug1.print();
        mug2.print();
    }
}
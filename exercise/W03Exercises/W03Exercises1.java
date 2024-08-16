public class W03Exercises1 {
    public static void main(String[] args) {
        Mug mug1 = new Mug("Standard", 90, 80);
        Mug mug2 = new Mug("Small", 70, 80);
        Mug mug3 = new Mug("large", 200, 200);

        // getter and setter test for mug 1 and mug 2, respectively
        // mug1.setWidth(100);
        // mug2.setHeight(60);

        mug1.print();
        mug2.print();
        mug3.print();

        // test codes for the methods
        System.out.println(mug2.getTopArea());
        System.out.println(mug1.getVolume());
        System.out.println(mug1.getMarshmallowLimit());
        System.out.println(mug2.getMarshmallowLimit());
    }
}
public class W09Exercises {
    public static void main(String[] args) {
        System.out.println("\n-- Test Mugs --");
        // testing mug
        Mug standardMug = new Mug("Standard", 90, 80);
        Mug smallMug = new Mug("Small", 80, 70);
        CuboidMug cuboidMug = new CuboidMug("Cuboid", 80, 70, 72);
        ConicalMug conicalMug = new ConicalMug("conical", 80, 70, 68);
        SquareMug squareMug = new SquareMug("square", 70);

        standardMug.print();
        smallMug.print();
        // cuboidMug.print();
        cuboidMug.printCuboid();
        conicalMug.printConical();
        squareMug.printCuboid();

    }
}
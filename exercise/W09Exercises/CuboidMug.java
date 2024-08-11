public class CuboidMug extends Mug {
    private int depth;

    public CuboidMug(String name, int height, int width, int depth) {
        super(name, height, width);
        this.depth = depth;
    }

    public int getCuboidTopArea() {
        return (int) (getWidth() * depth);

    }

    // ! why not divided by 1000000.0? Examine
    public double getCuboidVolume() {

        return (getCuboidTopArea() * getHeight()) / 1000000.0;
    }

    public int getCuboidMarshmallowLimit() {
        double volume = getCuboidVolume();
        return (int) (volume / LITRES_PER_MALLOW);
    }

    public void printCuboid() {
        System.out.println(getName() + " mug volume: " + getCuboidVolume());
        System.out.println(getName() + " mug marshmallow limit: " + getCuboidMarshmallowLimit());
    }

}

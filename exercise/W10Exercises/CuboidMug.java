public class CuboidMug extends Mug {
    private int depth;

    public CuboidMug(String name, int height, int width, int depth) {
        super(name, height, width);
        this.depth = depth;
    }
    
    public int getCuboidTopArea() {
        return getWidth() * this.depth;
    }

    public double getCuboidVolume() {
        return  getHeight() * getCuboidTopArea()/ 1000000.0; 
    }

    public int getCuboidMarshmallowLimit() {
        double volume = getCuboidVolume();
        return (int)(volume/Mug.LITRES_PER_MALLOW);
    }

    public void printCuboid() {
        System.out.printf("%s mug (%dmm x %dmm x %dmm), holding %.3fl and up to %d marshmallows.%n", 
            getName(), getHeight(), getWidth(), depth, getCuboidVolume(), getCuboidMarshmallowLimit());
    }
}

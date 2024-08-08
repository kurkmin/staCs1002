public class CuboidMug extends Mug {
    private int depth;

    public CuboidMug(String name, int height, int width, int depth) {
        super(name, height, width);
        this.depth = depth;
    }
    
    @Override
    public int getTopArea() {
        return getWidth() * this.depth;
    }

/*     @Override
    public void print() {
        System.out.printf("%s mug (%dmm x %dmm x %dmm), holding %.3fl and up to %d marshmallows.%n", 
            getName(), getHeight(), getWidth(), depth, getVolume(), getMarshmallowLimit());
    }*/

    @Override
    public String toString() {
        return String.format("%s mug (%dmm x %dmm x %dmm), holding %.3fl and up to %d marshmallows.", 
            getName(), getHeight(), getWidth(), depth, getVolume(), getMarshmallowLimit());
    }
}

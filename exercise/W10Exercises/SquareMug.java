public class SquareMug extends CuboidMug {
    public SquareMug(String name, int size) {
        super(name, size, size, size);
    }

    @Override
    public String toString() {
        return String.format("%s mug (%dmm x %dmm), holding %.3fl and up to %d marshmallows.",
                name, height, width, getVolume(), getMarshmallowLimit());
    }
}

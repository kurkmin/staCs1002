public class Mug {
    // part 1
    // field (attributes)
    private String name;
    private int height;
    private int width;

    // constructor
    public Mug(String mugName, int mugHeight, int mugWidth) {
        this.name = mugName;
        this.height = mugHeight;
        this.width = mugWidth;
    }

    // getters
    public String getName() {
        return this.name;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWidth() {
        return this.width;
    }

    // setters
    public void setHeight(int newHeight) {
        this.height = newHeight;
    }

    public void setWidth(int newWidth) {
        this.width = newWidth;
    }

    public void print() {
        System.out.printf("%s mug (%dmm x %dmm), holding %.3fl and up to %d marshmallows.%n",
                name, height, width, getVolume(), getMarshmallowLimit());
    }

    // part 2
    // calculates the surface area of the top of the mug
    public int getTopArea() {
        return (int) (width / 2.0 * width / 2.0 * Math.PI);
    }

    // calculates the volume of a mug
    public double getVolume() {
        return height * getTopArea() / 1000000.0;
    }

    // get the maximum number of marshmallows that are permitted per litre
    public int getMarshmallowLimit() {
        return (int) (getVolume() / 0.2);
    }

    public static void main(String[] args) {
    }
}
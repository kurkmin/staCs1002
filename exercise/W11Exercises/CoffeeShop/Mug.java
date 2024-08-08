public class Mug {
    private String name;
    private int height;
    private int width;
    protected static final double LITRES_PER_MALLOW = 0.2;

    public Mug(String name, int height, int width) {
        this.name = name;
        this.height = height;
        this.width = width;
    }

    public String getName() {
        return name;
    }
    
    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void print() {
        System.out.println(this);
    }

    //calculate area of the top of the mug
    public int getTopArea() {
        return (int)(width/2.0 * width/2.0 * Math.PI);
    }
     
    //calculate volume of mug
    public double getVolume() {
        return height * getTopArea()/ 1000000.0; //call method to calculate area of the top of the mug
    }

    //calculate how many marshmallows will fit in the mug
    public int getMarshmallowLimit() {
        double volume = getVolume();
        return (int)(volume/LITRES_PER_MALLOW);
    }

    @Override
    public String toString() {
        return String.format("%s mug (%dmm x %dmm), holding %.3fl and up to %d marshmallows.", 
            name, height, width, getVolume(), getMarshmallowLimit());
    }
}

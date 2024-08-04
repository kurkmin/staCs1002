public class Mug {
    private String name; 
    private int height; 
    private int width; 

    public Mug(String mugName, int mugHeight, int mugWidth) {
        this.name = mugName; 
        this.height = mugHeight; 
        this.width = mugWidth;
    }
    
    public String getName() {
        return this.name;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWidth() {
        return this.width;
    }

    public void setHeight(int newHeight) {
        this.height = newHeight;
    }

    public void setWidth(int newWidth) {
        this.width = newWidth;
    }

    public void print() {
        System.out.printf("%s mug (%dmm x %dmm).%n", name, height, width);
    }

    public static void main (String[] args) {
    }
}
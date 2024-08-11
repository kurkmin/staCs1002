public class ConicalMug extends Mug {
    private int baseWidth;

    public ConicalMug(String name, int height, int width, int baseWidth) {
        super(name, height, width);
        this.baseWidth = baseWidth;
    }

    public double getConicalVolume() {
        if (baseWidth == getWidth()) {
            return getVolume();
        }

        double topRadius = getWidth() / 2;
        double baseRadius = baseWidth / 2;
        double topArea = Math.PI * topRadius * topRadius;
        double baseArea = Math.PI * baseRadius * baseRadius;
        double heightExtension = getHeight() * (baseRadius / (topRadius - baseRadius));
        double totalHeight = heightExtension + getHeight();
        double coneVolume = topArea * (totalHeight / 3);
        double volumeExtension = baseArea * (heightExtension / 3);
        double volume = (coneVolume - volumeExtension) / 1000000.0;
        return volume;
    }

    public int getConicalMarshmallowLimit() {
        double volume = getVolume();
        return (int) (volume / LITRES_PER_MALLOW);
    }

    public void printConical() {
        System.out.println(getName() + " mug has a volume of " + getConicalVolume());
        System.out.println(getName() + " mug can have " + getConicalMarshmallowLimit() + " marhmallow(s)");
    }
}

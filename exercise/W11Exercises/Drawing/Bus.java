import cs1002.display.Drawable;
import java.util.ArrayList;
import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.Dimension;

public class Bus implements Drawable {
    private String routeNumber;
    private ArrayList<String> arrayList;

    public Bus(String routeNumber, ArrayList<String> arrayList) {
        this.routeNumber = routeNumber;
        this.arrayList = arrayList;
    }

    @Override
    public void draw(Graphics2D g2) {
        g2.setColor(Color.RED);
        g2.fillRoundRect(20, 20, 300, 150, 20, 20);
        g2.setColor(Color.CYAN);
        g2.fillRect(20, 40, 40, 80);
        g2.setColor(Color.BLACK);
        g2.fillOval(40, 150, 40, 40);
        g2.fillOval(260, 150, 40, 40);
    }

    @Override
    public Dimension getDimension() {
        Dimension dimension = new Dimension(340, 200);
        return dimension;
    }

    @Override
    public void print() {

    }

    @Override
    public String toHTMLString() {
        String message = "";
        for (int i = 0; i < arrayList.size(); i++) {
            message += arrayList.get(i) + "\n";
        }
        return "<html><h1>" + routeNumber + " </h1>" + "<h2>" + message + " </h2></html>";
    }

}

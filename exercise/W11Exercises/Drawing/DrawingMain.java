import java.util.ArrayList;

import cs1002.display.*;
import cs1002.burgers.*;
import cs1002.people.*;

public class DrawingMain {
    public static void main(String[] args) {
        ArrayList<Drawable> myList = new ArrayList<Drawable>();
        Burger burger = new Burger("Cheese burger", 10);
        myList.add(burger);
        Person person = new Person("Sumin", 180, 1997, 01, 20);
        myList.add(person);
        PictureDisplay pictureDisplay = new PictureDisplay();
        for (int i = 0; i < myList.size(); i++) {
            pictureDisplay.add(myList.get(i));
        }
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Dundee");
        arrayList.add("Leuchars");
        arrayList.add("St.Andrews");
        Bus bus = new Bus("99", arrayList);
        System.out.println(bus.toHTMLString());
        bus.getDimension();
        pictureDisplay.add(bus);

        // for (int i = 0; i < myList.size(); i++) {
        // pictureDisplay.add(arrayList.get(i));
        // }

    }
}
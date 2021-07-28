package GameObjects;

import javafx.scene.image.Image;

import java.io.File;

public class Guava extends Fruit {
    @Override
    public Image[] getImages() {
        Image[] Arr;
        Arr = new Image[3];
        File file = new File(System.getProperty("user.dir") + "/src/GUI/Sprites/Guava.png");
        Image image = new Image(file.toURI().toString());
        Arr[0] = image;
        file = new File(System.getProperty("user.dir") + "/src/GUI/Sprites/GuavaLeft.png");
        image = new Image(file.toURI().toString());
        Arr[1] = image;
        file = new File(System.getProperty("user.dir") + "/src/GUI/Sprites/GuavaRight.png");
        image = new Image(file.toURI().toString());
        Arr[2] = image;
        return Arr;
    }
}

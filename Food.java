import java.lang.Math;

public class Food {
    int x, y;
    int min, max;

    public Food(int size) {
        min = 0;
        max = size;
        x = (int) (Math.random() * (max - min) + min);
        y = (int) (Math.random() * (max - min) + min);
    }

    public void reRoll() {
        x = (int) (Math.random() * (max - min) + min);
        y = (int) (Math.random() * (max - min) + min);
    }

}

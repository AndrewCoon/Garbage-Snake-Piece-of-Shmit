import javax.swing.*;
import java.awt.Color;
import java.awt.Graphics;

public class Snake {
    int size = 450;
    Frame frame = new Frame(size, size, "Snake Game");
    Panel panel;
    JLabel score = new JLabel();
    Food f;
    Color[] colors;
    int map[][];
    boolean running = true;
    /*
     * 0 - Blank
     * 1 - Snake
     * 2 - Head
     * 3 - Food
     */
    int min, max, curX, curY, type;
    int dir = 0; // defaults to North
    /*
     * 0 - North
     * 1 - East
     * 2 - South
     * 3 - West
     */
    int mSize = 20;
    int tSize; // Tile Size

    public Snake() {
        onLoad();
        update();

        // while (running) {
        // update();
        // }
    }

    public void onLoad() {
        initMap();
        tSize = size / mSize;
        panel = new Panel(size, tSize, mSize);
        frame.setBackground(Color.BLACK);
        frame.add(panel);
        frame.pack();
        panel.setBounds(0, 0, size, size);
        min = 0;
        max = mSize;
    }

    private void initMap() {
        map = new int[mSize][mSize];
        for (int i = 0; i < mSize; i++) {
            for (int j = 0; j < mSize; j++) {
                map[i][j] = 0;
            }
        }

        // First Head
        Head h = new Head(mSize);
        // First Apple
        f = new Food(mSize);
        
        map[h.x][h.y] = 2;
        map[f.x][f.y] = 3;

        if (f.x == h.x  && f.y == h.y) {
            f.reRoll();
        }
        printMap();
    }

    private void update() {
        // Sets Food Pos

        map[f.x][f.y] = 3;
        panel.map = map;
        panel.repaint();
    }

    void printMap() {
        for (int i = 0; i < mSize; i++) {
            System.out.println();
            for (int j = 0; j < mSize; j++) {
                System.out.print(map[i][j]);
            }
        }
        System.out.println();
    }
}
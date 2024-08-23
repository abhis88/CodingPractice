import java.awt.*;

public class Basics {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Canvas canvas = new Canvas();
        canvas.setVisible(true);
        canvas.setSize(600, 600);
        canvas.setBackground(Color.BLACK);
        canvas.setFocusable(true);

        Graphics g = canvas.getGraphics();

    }
}

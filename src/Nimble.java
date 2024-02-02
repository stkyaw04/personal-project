import edu.macalester.*;
import edu.macalester.graphics.*;
import edu.macalester.graphics.Rectangle;

import java.awt.*;

public class Nimble {

    int CANVAS_WIDTH = 1000;
    int CANVAS_HEIGHT = 500;

    Board board;
    

    public Nimble(){

        CanvasWindow canvas = new CanvasWindow("Nimble", CANVAS_WIDTH, CANVAS_HEIGHT);
        canvas.setBackground(Color.white);

        new Board(canvas, CANVAS_WIDTH, CANVAS_HEIGHT);

        

    }

    public static void main(String[] args) {
        new Nimble();
    }
    
}

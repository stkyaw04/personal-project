import edu.macalester.*;
import edu.macalester.graphics.CanvasWindow;
import edu.macalester.graphics.Rectangle;

public class Board {

    Rectangle[] board;
    Rectangle rectangle;
    
    public Board(CanvasWindow canvas, int CANVAS_WIDTH, int CANVAS_HEIGHT){

        draw(canvas, CANVAS_WIDTH, CANVAS_HEIGHT);       
        
    }

    public void draw(CanvasWindow canvas, int CANVAS_WIDTH, int CANVAS_HEIGHT){

        int width = 100;
        int height = 200;

        int initialX = CANVAS_WIDTH - 800;
        int initialY = CANVAS_HEIGHT - 350;

        for(int i = 0; i <= 5; i++){

            rectangle = new Rectangle(initialX, initialY, width, height);
            rectangle.setStrokeWidth(1);
            canvas.add(rectangle);
            initialX += width;

        }

    }
}

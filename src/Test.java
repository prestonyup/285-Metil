import apcslib.*;

public class Test {
    public static void main(String[] args) {
        SketchPad paper = new SketchPad(500, 500);
        DrawingTool pen = new DrawingTool(paper);

        pen.drawRect(100, 100);
    }
}
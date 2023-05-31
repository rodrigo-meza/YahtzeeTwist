import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

import graphicComponents.DrawablePolygon;
import graphicComponents.Drawing;
import graphicComponents.RegularPolygon;

public class App {
    public static void main(String[] args) throws Exception {
        // create some regular polygons
        DrawablePolygon p1 = new RegularPolygon(3, 20, Color.GREEN,Math.PI/6);
        DrawablePolygon p2 = new RegularPolygon(4,20, Color.ORANGE,Math.PI/4);
        DrawablePolygon p3 = new RegularPolygon(360, 20, Color.BLUE,0);
        DrawablePolygon p4 = new DrawablePolygon();
        DrawablePolygon p5 = new RegularPolygon(4,20, Color.ORANGE,0);
        DrawablePolygon p6 = new RegularPolygon(3,20, Color.ORANGE,0);
        // move them out of the corner
        p1.translate(100, 80);
        p2.translate(250, 120);
        p3.translate(400, 160);
        p5.translate(200, 200);
        p6.translate(300,100);
        // create drawing, add polygons
        Drawing drawing = new Drawing(500, 250);
        drawing.add(p1);
        drawing.add(p2);
        drawing.add(p3);
        drawing.add(p4);
        drawing.add(p5);
        drawing.add(p6);
        // set up the window frame
        JFrame frame = new JFrame("Drawing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(drawing);
        frame.pack();
        frame.setVisible(true);
    }
}

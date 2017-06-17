package com.infoclinika;


import java.awt.*;
import java.util.*;
import java.util.concurrent.ConcurrentLinkedQueue;

public class SomeRectangles {

    private Queue<Rectangle> rectangles;

    public SomeRectangles(){
        rectangles = new ConcurrentLinkedQueue<>();
        add(0, 0, 7, 5);
        add(6, 6, 5, 5);
        //TODO...
    }

    private boolean add(int x, int y, int width, int height) {
        Rectangle rectangle = new Rectangle();
        rectangle.setBounds(x, y, width, height);
        if (!isIntersects(rectangle, rectangles)){
            rectangles.add(rectangle);
            return true;
        }
        return false;
    }

    private boolean isIntersects(Rectangle rectangle, Queue<Rectangle> rectangles){
        for (Rectangle r : rectangles){
            if (isIntersect(rectangle, r))
                return true;
        }
        return false;
    }

    private boolean isIntersect(Rectangle r1, Rectangle r2){
        if(r1.getMinX() > r2.getMaxX() || r1.getMaxX() < r2.getMinX()
                || r1.getMaxY() < r2.getMinY() || r1.getMinY() > r2.getMaxY())
            return false;
        return true;
    }

    public Queue<Rectangle> getRectangles() {
        return rectangles;
    }
}

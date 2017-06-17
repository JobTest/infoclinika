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

    private void add(int x, int y, int width, int height) {
        Rectangle rectangle = new Rectangle();
        rectangle.setBounds(x, y, width, height);
        rectangles.add(rectangle);
    }

    public Queue<Rectangle> getRectangles() {
        return rectangles;
    }
}

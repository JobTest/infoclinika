package com.infoclinika;


import java.awt.*;
import java.util.Collections;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class SomeRectangles {

    private Set<Rectangle> rectangles;

    public SomeRectangles(){
        rectangles = new TreeSet(new Comparator<Rectangle>() {
            @Override
            public int compare(Rectangle o1, Rectangle o2) {
                return (isIntersect(o1, o2) ? 0 : 1);
            }
        });

        add(0, 0, 7, 5);
        add(6, 6, 5, 5);
        //TODO...
    }

    private boolean add(int x, int y, int width, int height) {
        Rectangle rectangle = new Rectangle();
        rectangle.setBounds(x, y, width, height);

        return rectangles.add(rectangle);
    }

    public Set<Rectangle> getRectangles() {
        return rectangles;
    }

    private boolean isIntersect(Rectangle r1, Rectangle r2){
        if(r1.getMinX() > r2.getMaxX() || r1.getMaxX() < r2.getMinX()
                || r1.getMaxY() < r2.getMinY() || r1.getMinY() > r2.getMaxY())
            return false;
        return true;
    }

}

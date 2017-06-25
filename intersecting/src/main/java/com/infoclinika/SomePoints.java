package com.infoclinika;

import java.awt.*;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;


public class SomePoints {

    private Set<Rectangle> points;

    public SomePoints(){
        points = new TreeSet(new Comparator<Rectangle>() {
            @Override
            public int compare(Rectangle o1, Rectangle o2) {
                return (isIntersect(o1, o2) ? 0 : 1);
            }
        });

        add(0, 0);
        add(5, 5);
        add(6, 6);
        //TODO...
    }

    private boolean add(int x, int y) {
        Rectangle rectangle = new Rectangle();
        rectangle.setBounds(x, y, 0, 0);

        return points.add(rectangle);
    }

    public Set<Rectangle> getPoints() {
        return points;
    }

    private boolean isIntersect(Rectangle r1, Rectangle r2){
        if(r1.getMinX() > r2.getMaxX() || r1.getMaxX() < r2.getMinX()
                || r1.getMaxY() < r2.getMinY() || r1.getMinY() > r2.getMaxY())
            return false;
        return true;
    }
}

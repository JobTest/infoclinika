package com.infoclinika;


import java.awt.*;
import java.util.Set;

public class IntersectingAlgorithm {

    private Set<Rectangle> items;

    public IntersectingAlgorithm(){
        SomeRectangles rectangles = new SomeRectangles();
        items = rectangles.getRectangles();
    }

    public boolean addPoints(Set<Rectangle> points) {
        return items.addAll(points);
    }

    public Set<Rectangle> getItems() {
        return items;
    }
}

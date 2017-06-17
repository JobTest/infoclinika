package com.infoclinika;


import java.awt.*;
import java.util.*;

public class IntersectingAlgorithm {

    public boolean isIntersects(Queue<Point> points, Queue<Rectangle> rectangles){
        for (Point point : points){
            if (isIntersects(point, rectangles))
                return true;
        }
        return false;
    }

    public boolean isIntersects(Point point, Queue<Rectangle> rectangles){
        for (Rectangle rectangle : rectangles){
            if (isIntersect(point, rectangle))
                return true;
        }
        return false;
    }

    private boolean isIntersect(Point p, Rectangle r){
        if(p.getX() > r.getMaxX() || p.getX() < r.getMinX()
                || p.getY() < r.getMinY() || p.getY() > r.getMaxY())
            return false;
        return true;
    }

    private boolean isIntersect(Rectangle r1, Rectangle r2){
        if(r1.getMinX() > r2.getMaxX() || r1.getMaxX() < r2.getMinX()
                || r1.getMaxY() < r2.getMinY() || r1.getMinY() > r2.getMaxY())
            return false;
        return true;
    }
}

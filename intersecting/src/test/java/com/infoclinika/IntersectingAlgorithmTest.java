package com.infoclinika;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.awt.*;
import java.util.*;
import java.util.concurrent.ConcurrentLinkedQueue;

public class IntersectingAlgorithmTest {

    private SomeRectangles rectangles;
    private IntersectingAlgorithm algorithm;

    /**
     * Collection of rectangles is somehow populated in the class. It's static and final.
     */
    @Before
    public void setUp() {
        rectangles = new SomeRectangles();
        algorithm = new IntersectingAlgorithm();
    }

    @After
    public void tearDown(){
        rectangles = null;
        algorithm = null;
    }

    /**
     * test Is Intersecting
     */
    @Test
    public void testIsIntersecting(){
//        Point point = new Point(20,20);
        Point point = new Point(4,4);
        Assert.assertTrue( algorithm.isIntersects(point, rectangles.getRectangles()) );
    }

    /**
     * test Is Intersectings
     * Millions of coordinates can be passed into the method
     */
    @Test
    public void testIsIntersectings(){
        Queue<Point> points = new ConcurrentLinkedQueue<>();
//        points.add(new Point(4,4));
        points.add(new Point(20,20));
        points.add(new Point(21,21));
        points.add(new Point(22,22));
        points.add(new Point(23,23));

        Assert.assertFalse( algorithm.isIntersects(points, rectangles.getRectangles()) );
    }
}

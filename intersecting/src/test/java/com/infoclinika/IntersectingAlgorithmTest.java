package com.infoclinika;

import org.junit.Before;
import org.junit.Test;

public class IntersectingAlgorithmTest {

    private IntersectingAlgorithm algorithm;
    private SomePoints points = new SomePoints();

    @Before
    public void setUp() {
        algorithm = new IntersectingAlgorithm();
        points = new SomePoints();
    }

    /**
     * test Is Intersectings
     * Millions of coordinates can be passed into the method
     */
    @Test
    public void testIsIntersectings(){
        algorithm.addPoints(points.getPoints());

        System.out.println( algorithm.getItems() );
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryPatterns;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author saahil
 */
public class FactoryPatternDemoIT {

    /**
     * Test of main method, of class FactoryPatternDemo.
     */
    @Test
    public void testCircle() {
        ShapeFactory factory = new ShapeFactory();
        Shape shapeA = factory.getShape("Circle");
        // Check if the products created are of the expected type
        assertTrue(shapeA instanceof Shape);
    }
    
    @Test
    public void testSquare() {
        ShapeFactory factory = new ShapeFactory();
        Shape shapeB = factory.getShape("Square");
        // Check if the products created are of the expected type
        assertTrue(shapeB instanceof Shape);
    }
    
    @Test
    public void testRectangle() {
        ShapeFactory factory = new ShapeFactory();
        Shape shapeC = factory.getShape("Rectangle");
        // Check if the products created are of the expected type
        assertTrue(shapeC instanceof Shape);
    }
    
       
    
}

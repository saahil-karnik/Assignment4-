/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FacadePatterns;

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
public class ShapeMakerIT {
   

    /**
     * Test of drawCircle method, of class ShapeMaker.
     */
    @Test
    public void testDrawCircle() {
        System.out.println("drawCircle");
        ShapeMaker instance = new ShapeMaker();
        instance.drawCircle();
        assertTrue(instance instanceof ShapeMaker);
        // TODO review the generated test code and check the result.
       
    }

    /**
     * Test of drawRectangle method, of class ShapeMaker.
     */
    @Test
    public void testDrawRectangle() {
       System.out.println("drawCircle");
        ShapeMaker instance = new ShapeMaker();
        instance.drawRectangle();
        assertTrue(instance instanceof ShapeMaker);
        // TODO review the generated test code and check the result.
    }

    /**
     * Test of drawTriangle method, of class ShapeMaker.
     */
    @Test
    public void testDrawTriangle() {
        System.out.println("drawCircle");
        ShapeMaker instance = new ShapeMaker();
        instance.drawTriangle();
        assertTrue(instance instanceof ShapeMaker);
        // TODO review the generated test code and check the result.
        
    }
    
}

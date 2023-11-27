/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SingletonPatterns;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author owner
 */
public class SingleObjectIT {

    /**
     * Test of getInstance method, of class SingleObject.
     */
    @Test
    public void testGetInstance() {
        System.out.println("getInstance");
        SingleObject expResult = SingleObject.getInstance();
        SingleObject result = SingleObject.getInstance();
        assertEquals(expResult, result);
        // TODO review the generated test code and check the result.
        
    }
}

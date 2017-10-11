/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author cproc
 */

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test 
 */
public class MainTest 
    extends TestCase
{
    /**
     * Create the test case
     */
    public MainTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( MainTest.class );
    }

    public void testMain()
    {
        assertTrue( true );
    }
}